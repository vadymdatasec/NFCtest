.class public abstract Le/d/a/a/d/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Le/d/a/a/d/f;->b()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    sput-object v0, Le/d/a/a/d/f;->a:Ljavax/net/ssl/X509TrustManager;

    return-void
.end method

.method public static a()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    sget-object v0, Le/d/a/a/d/f;->a:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public static b()Ljavax/net/ssl/X509TrustManager;
    .locals 7

    const-string v0, "Should never happen"

    .line 1
    :try_start_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v2, 0x0

    .line 3
    :try_start_1
    invoke-virtual {v1, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V
    :try_end_1
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_0

    .line 4
    invoke-virtual {v1}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    .line 5
    instance-of v6, v5, Ljavax/net/ssl/X509TrustManager;

    if-eqz v6, :cond_0

    .line 6
    check-cast v5, Ljavax/net/ssl/X509TrustManager;

    move-object v2, v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    return-object v2

    .line 7
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 8
    :catch_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :catch_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
