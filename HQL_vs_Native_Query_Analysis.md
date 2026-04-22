### So sánh 

| Tiêu chí | Native Query | HQL |
|----------|--------------|-----|
| **Cú pháp** | SQL thuần, phụ thuộc database | OOP, độc lập database |
| **Đối tượng** | Tên bảng, cột | Tên entity, property |
| **Tính portability** | Thấp - phải viết lại khi đổi DB | Cao - không cần thay đổi |
| **Type safety** | Thấp - lỗi runtime | Cao - lỗi compile-time |
| **Performance** | Tối ưu tối đa | Hơi chậm hơn do translation |
| **Bảo mật** | Dễ bị SQL Injection | Tự động escape parameters |

