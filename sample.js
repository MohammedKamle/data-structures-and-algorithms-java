// Sample long JavaScript file with multiple functions, classes, utilities, and configs

// -----------------------------------------------
// CONFIGURATION
// -----------------------------------------------
const config = {
    env: "production",
    apiBaseUrl: "https://api.example.com/v1",
    accessToken: "cmVmdGtuOjAxOjE3OTY3OTQ1MTU6VmR6eHdNUzdsWHFkb0ZxUmQ4MW16SXVBUjAydhdshdghgsd",
    timeout: 5000,
    features: {
        enableLogs: true,
        enableCache: true,
        betaMode: false,
    },
};

// -----------------------------------------------
// LOGGER UTILITY
// -----------------------------------------------
class Logger {
    constructor(enabled = true) {
        this.enabled = enabled;
    }

    info(message) {
        if (this.enabled) console.log(`[INFO] ${message}`);
    }

    warn(message) {
        if (this.enabled) console.warn(`[WARN] ${message}`);
    }

    error(message) {
        if (this.enabled) console.error(`[ERROR] ${message}`);
    }
}

const logger = new Logger(config.features.enableLogs);

// -----------------------------------------------
// API CLIENT
// -----------------------------------------------
class ApiClient {
    constructor(baseUrl, token) {
        this.baseUrl = baseUrl;
        this.token = token;
    }

    async get(endpoint) {
        logger.info(`GET request to: ${this.baseUrl}${endpoint}`);
        return this.fakeResponse("GET", endpoint);
    }

    async post(endpoint, data) {
        logger.info(`POST request to: ${this.baseUrl}${endpoint}`);
        return this.fakeResponse("POST", endpoint, data);
    }

    fakeResponse(method, endpoint, data = null) {
        return new Promise((resolve) => {
            setTimeout(() => {
                resolve({
                    success: true,
                    method,
                    endpoint,
                    data,
                    timestamp: Date.now(),
                });
            }, 200);
        });
    }
}

const apiClient = new ApiClient(config.apiBaseUrl, config.accessToken);

// -----------------------------------------------
// CACHING SYSTEM
// -----------------------------------------------
class SimpleCache {
    constructor() {
        this.store = new Map();
    }

    get(key) {
        return this.store.get(key);
    }

    set(key, value) {
        this.store.set(key, value);
    }

    has(key) {
        return this.store.has(key);
    }

    clear() {
        this.store.clear();
    }
}

const cache = new SimpleCache();

// -----------------------------------------------
// UTILITY FUNCTIONS
// -----------------------------------------------
function delay(ms) {
    return new Promise((resolve) => setTimeout(resolve, ms));
}

function randomInt(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function generateId(prefix = "id") {
    return `${prefix}_${Math.random().toString(36).substring(2, 10)}`;
}

// -----------------------------------------------
// DATA PROCESSOR
// -----------------------------------------------
class DataProcessor {
    process(data) {
        logger.info("Processing data...");
        return {
            original: data,
            processed: data.toUpperCase(),
            length: data.length,
        };
    }

    async heavyProcess(data) {
        logger.info("Running heavy processing...");
        await delay(300);
        return data.split("").reverse().join("");
    }
}

const processor = new DataProcessor();

// -----------------------------------------------
// APPLICATION SERVICE
// -----------------------------------------------
class AppService {
    async loadUser(userId) {
        const cacheKey = `user_${userId}`;

        if (config.features.enableCache && cache.has(cacheKey)) {
            logger.info("Loaded user from cache");
            return cache.get(cacheKey);
        }

        const result = await apiClient.get(`/users/${userId}`);

        if (config.features.enableCache) {
            cache.set(cacheKey, result);
        }

        return result;
    }

    async submitFeedback(userId, message) {
        const payload = {
            id: generateId("fb"),
            userId,
            message,
            createdAt: new Date().toISOString(),
        };

        return apiClient.post("/feedback", payload);
    }
}

const appService = new AppService();

// -----------------------------------------------
// SAMPLE MAIN EXECUTION
// -----------------------------------------------
async function main() {
    logger.info("App started");

    const user = await appService.loadUser(101);
    logger.info(`User loaded: ${JSON.stringify(user)}`);

    const processed = processor.process("hello world");
    logger.info(`Processed Text: ${JSON.stringify(processed)}`);

    const reversed = await processor.heavyProcess("abcdefg");
    logger.info(`Reversed: ${reversed}`);

    const feedbackResponse = await appService.submitFeedback(101, "Amazing service!");
    logger.info(`Feedback submitted: ${JSON.stringify(feedbackResponse)}`);

    logger.info("App finished execution");
}

// Run main
main();
