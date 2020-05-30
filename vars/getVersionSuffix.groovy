def call() {
    node {
        if (params.RC) {
            return env.VERSION_RC
        } else {
            return env.VERSION_RC + '+ci.' + env.BUILD_NUMBER
        }
    }
}
