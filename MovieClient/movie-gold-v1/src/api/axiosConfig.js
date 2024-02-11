import axios from 'axios';

export default axios.create({
    // baseURL:'https:9c96-103-106-239-104.ap.ngrok.io',
    // baseURL:'https://dd8b-193-1-98-139.ngrok-free.app',
    // headers:{"ngrok-skip-broswer-warning": "true"}
    baseURL: 'http://localhost:8080',
    timeout: 20000,
    headers: {"Content-type":"application/json" }
})