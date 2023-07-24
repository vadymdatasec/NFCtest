.class public Le/d/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Le/d/a/a/b;


# instance fields
.field public final a:Le/d/a/a/c/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/d/a/a/c/g;)V
    .locals 5

    const-string v0, "N/A"

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/d/a/a/b;->a:Le/d/a/a/c/g;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {p2}, Le/d/a/a/c/g;->a()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v1, "App is debuggable - processing <debug-overrides> configuration."

    .line 5
    invoke-static {v1}, Le/d/a/a/f/a;->a(Ljava/lang/String;)V

    .line 6
    :cond_1
    invoke-virtual {p2}, Le/d/a/a/c/g;->b()Z

    move-result p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    .line 7
    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 8
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-object v2, v0

    :goto_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v2

    .line 9
    :goto_3
    invoke-static {p1}, Le/d/a/a/f/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 10
    new-instance v4, Le/d/a/a/e/a;

    invoke-direct {v4, p1, v1, v0, v2}, Le/d/a/a/e/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    :try_start_1
    invoke-static {v3, p2, v4}, Le/d/a/a/d/g;->a(Ljava/util/Set;ZLe/d/a/a/e/a;)V
    :try_end_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    .line 12
    :catch_1
    new-instance p1, Lcom/datatheorem/android/trustkit/config/ConfigurationException;

    const-string p2, "Could not parse <debug-overrides> certificates"

    invoke-direct {p1, p2}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Landroid/content/Context;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    .line 2
    new-instance v0, Le/d/a/a/a;

    invoke-direct {v0}, Le/d/a/a/a;-><init>()V

    const-string v1, ""

    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/ApplicationInfo;->dump(Landroid/util/Printer;Ljava/lang/String;)V

    .line 4
    invoke-static {v0}, Le/d/a/a/a;->a(Le/d/a/a/a;)I

    move-result p0

    return p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;I)Le/d/a/a/b;
    .locals 3

    const-class v0, Le/d/a/a/b;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Le/d/a/a/b;->b:Le/d/a/a/b;

    if-nez v1, :cond_3

    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_2

    .line 7
    invoke-static {p0}, Le/d/a/a/b;->a(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException;

    const-string p1, "TrustKit was initialized with a different network policy than the one configured in the App\'s manifest."

    invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 9
    :cond_1
    new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException;

    const-string p1, "TrustKit was initialized with a network policy that was not properly configured for Android N - make sure it is in the App\'s Manifest."

    invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :cond_2
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Le/d/a/a/c/g;->a(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/g;

    move-result-object p1
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :try_start_2
    new-instance v1, Le/d/a/a/b;

    invoke-direct {v1, p0, p1}, Le/d/a/a/b;-><init>(Landroid/content/Context;Le/d/a/a/c/g;)V

    sput-object v1, Le/d/a/a/b;->b:Le/d/a/a/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 13
    monitor-exit v0

    return-object v1

    .line 14
    :catch_0
    :try_start_3
    new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException;

    const-string p1, "Could not find the debug certificate in the network security police file"

    invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :catch_1
    new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException;

    const-string p1, "Could not parse network security policy file"

    invoke-direct {p0, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 16
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "TrustKit has already been initialized"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static b()Le/d/a/a/b;
    .locals 2

    .line 1
    sget-object v0, Le/d/a/a/b;->b:Le/d/a/a/b;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TrustKit has not been initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Le/d/a/a/c/g;
    .locals 1

    .line 17
    iget-object v0, p0, Le/d/a/a/b;->a:Le/d/a/a/c/g;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    :try_start_0
    const-string v0, "TLS"

    .line 18
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, p1}, Le/d/a/a/b;->b(Ljava/lang/String;)Ljavax/net/ssl/X509TrustManager;

    move-result-object p1

    aput-object p1, v1, v2

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1, p1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 20
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 21
    :goto_0
    invoke-virtual {p1}, Ljava/security/GeneralSecurityException;->printStackTrace()V

    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Should not happen"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;)Ljavax/net/ssl/X509TrustManager;
    .locals 0

    .line 3
    invoke-static {p1}, Le/d/a/a/d/g;->a(Ljava/lang/String;)Ljavax/net/ssl/X509TrustManager;

    move-result-object p1

    return-object p1
.end method
