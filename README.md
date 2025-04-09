# API_Test_Cucumber_Framework

Bu proje, RESTful API testleri için oluşturulmuş bir **Cucumber Framework** yapısıdır. `GET`, `POST`, `PUT`, `PATCH`, `DELETE` ve `XML` istekleri desteklenmektedir. Framework, **Cucumber + Java + RestAssured** kullanılarak yapılandırılmıştır. Ayrıca, **paralel test çalıştırma**, **raporlama**, **hata durumunda log alma**, **GitHub Actions** ve **Jenkins entegrasyonu** gibi özellikler barındırır.

---

## 🔧 Kullanılan Teknolojiler

- **Java**
- **Rest Assured**
- **Cucumber (BDD)**
- **JUnit**
- **Maven**
- **GitHub Actions**
- **Jenkins**
- **Extent Reports / Cucumber Reports**

---

## 📁 Proje Yapısı

```
├── baseurl              -> Base URL ve endpoint tanımlamaları
├── hooks                -> Test başı ve sonu işlemleri (Before / After)
├── pojo                 -> Request/Response model sınıfları
├── runner               -> Cucumber runner sınıfı
├── stepdefinition       -> Step adımları ve request yanıt işlemleri
├── utilities            -> Ortak yardımcı metotlar
├── features             -> .feature dosyaları (Senaryo tanımlamaları)
├── failed               -> Hatalı senaryolar için .txt log dosyaları
```

---

## ✅ Desteklenen HTTP Metotları

- ✅ `GET`
- ✅ `POST`
- ✅ `PUT`
- ✅ `PATCH`
- ✅ `DELETE`
- ✅ `XML` format desteği

---

## 🧪 Test Çalıştırma

### Komut Satırından:

```bash
mvn clean verify
```

### Jenkins Üzerinden:

- Pipeline konfigürasyonu ile `mvn clean verify` komutu çalıştırılarak testler tetiklenebilir.

---

## 📊 Raporlama

Test çalıştırıldıktan sonra `target` klasörü altında **Cucumber Reports** otomatik olarak oluşturulur.

```bash
target/cucumber-reports/index.html
```

---

## ❌ Hata Yönetimi

Herhangi bir step adımı hata verdiğinde, `failed` klasörü altında ilgili hataya ait `.txt` dosyası oluşturulur.

```
/failed/failed_scenario_log.txt
```

---

## 🔄 Paralel Test Koşumu

Proje `Cucumber`'ın paralel test desteğine sahiptir. `Runner` yapısı buna göre optimize edilmiştir.

---

## ⚙️ GitHub Actions

Proje, GitHub Actions kullanılarak otomatik olarak CI/CD sürecine entegre edilmiştir. `.github/workflows` dizininde gerekli konfigürasyon yer almaktadır.

---

## 💻 Kurulum & Çalıştırma

1. Projeyi klonlayın:
```bash
git clone https://github.com/esmanur-karatas/API_Test_Cucumber_Framework.git
```

2. Maven bağımlılıklarını yükleyin:
```bash
mvn clean install
```

3. Testleri çalıştırın:
```bash
mvn verify
```

---

## 👩‍💻 Geliştirici

**Esmanur Karataş**  
📧 esmanurkaratas0@gmail.com  
🌐 [LinkedIn](https://www.linkedin.com/in/esmanurkaratas)

---

## ⚠️ Lisans

Bu proje açık kaynaklıdır ve MIT lisansı ile lisanslanmıştır.



https://github.com/user-attachments/assets/fe20ed6a-e22e-4dde-aad1-98111ae37ba8



