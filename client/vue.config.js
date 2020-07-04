module.exports = {
  devServer: {
    open: true,
    host: 'localhost',
    port: 8888,
    https: false,
    proxy: {
      '/api': {
        target: 'http://localhost:9999',
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    }
  }
}
