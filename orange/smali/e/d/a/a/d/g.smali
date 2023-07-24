.class public abstract Le/d/a/a/d/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljavax/net/ssl/X509TrustManager; = null

.field public static b:Z = false

.field public static c:Le/d/a/a/e/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()Le/d/a/a/e/a;
    .locals 2

    .line 17
    sget-object v0, Le/d/a/a/d/g;->c:Le/d/a/a/e/a;

    if-eqz v0, :cond_0

    return-object v0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TrustManagerBuilder has not been initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/lang/String;)Ljavax/net/ssl/X509TrustManager;
    .locals 3

    .line 9
    sget-object v0, Le/d/a/a/d/g;->a:Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_3

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    .line 11
    sget-object p0, Le/d/a/a/d/g;->a:Ljavax/net/ssl/X509TrustManager;

    return-object p0

    .line 12
    :cond_0
    invoke-static {}, Le/d/a/a/b;->b()Le/d/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Le/d/a/a/b;->a()Le/d/a/a/c/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/d/a/a/c/g;->a(Ljava/lang/String;)Le/d/a/a/c/b;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 13
    sget-boolean v1, Le/d/a/a/d/g;->b:Z

    if-eqz v1, :cond_1

    goto :goto_0

    .line 14
    :cond_1
    new-instance v1, Le/d/a/a/d/d;

    sget-object v2, Le/d/a/a/d/g;->a:Ljavax/net/ssl/X509TrustManager;

    invoke-direct {v1, p0, v0, v2}, Le/d/a/a/d/d;-><init>(Ljava/lang/String;Le/d/a/a/c/b;Ljavax/net/ssl/X509TrustManager;)V

    return-object v1

    .line 15
    :cond_2
    :goto_0
    sget-object p0, Le/d/a/a/d/g;->a:Ljavax/net/ssl/X509TrustManager;

    return-object p0

    .line 16
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "TrustManagerBuilder has not been initialized"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Ljava/util/Set;ZLe/d/a/a/e/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/security/cert/Certificate;",
            ">;Z",
            "Le/d/a/a/e/a;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyStoreException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/d/a/a/d/g;->a:Ljavax/net/ssl/X509TrustManager;

    if-nez v0, :cond_2

    .line 2
    invoke-static {}, Le/d/a/a/d/f;->a()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    sput-object v0, Le/d/a/a/d/g;->a:Ljavax/net/ssl/X509TrustManager;

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    return-void

    .line 4
    :cond_0
    sput-boolean p1, Le/d/a/a/d/g;->b:Z

    if-eqz p0, :cond_1

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p1

    if-lez p1, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    .line 6
    invoke-static {p0}, Le/d/a/a/d/a;->a(Ljava/util/Set;)Ljavax/net/ssl/X509TrustManager;

    move-result-object p0

    sput-object p0, Le/d/a/a/d/g;->a:Ljavax/net/ssl/X509TrustManager;

    .line 7
    :cond_1
    sput-object p2, Le/d/a/a/d/g;->c:Le/d/a/a/e/a;

    return-void

    .line 8
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "TrustManagerBuilder has already been initialized"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
