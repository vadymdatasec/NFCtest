.class public Le/d/a/a/d/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# instance fields
.field public final a:Landroid/net/http/X509TrustManagerExtensions;

.field public final b:Ljava/lang/String;

.field public final c:Le/d/a/a/c/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le/d/a/a/c/b;Ljavax/net/ssl/X509TrustManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/d/a/a/d/d;->b:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Le/d/a/a/d/d;->c:Le/d/a/a/c/b;

    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x11

    if-ge p1, p2, :cond_0

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Le/d/a/a/d/d;->a:Landroid/net/http/X509TrustManagerExtensions;

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Landroid/net/http/X509TrustManagerExtensions;

    invoke-direct {p1, p3}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V

    iput-object p1, p0, Le/d/a/a/d/d;->a:Landroid/net/http/X509TrustManagerExtensions;

    :goto_0
    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/Set;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Ljava/util/Set<",
            "Le/d/a/a/c/e;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    .line 2
    new-instance v1, Le/d/a/a/c/e;

    invoke-direct {v1, v0}, Le/d/a/a/c/e;-><init>(Ljava/security/cert/Certificate;)V

    .line 3
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/security/cert/CertificateException;

    const-string p2, "Client certificates not supported!"

    invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    const-string v0, "Pin verification failed"

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 2
    sget-object v1, Le/d/a/a/d/c;->a:Le/d/a/a/d/c;

    iget-object v2, p0, Le/d/a/a/d/d;->b:Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v5, p1, v3

    invoke-virtual {v1, v2, v5}, Le/d/a/a/d/c;->a(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const/16 v5, 0x18

    .line 3
    :try_start_0
    iget-object v6, p0, Le/d/a/a/d/d;->a:Landroid/net/http/X509TrustManagerExtensions;

    iget-object v7, p0, Le/d/a/a/d/d;->b:Ljava/lang/String;

    invoke-virtual {v6, p1, p2, v7}, Landroid/net/http/X509TrustManagerExtensions;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    move p2, v1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v5, :cond_0

    .line 5
    invoke-virtual {p1}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p2, v1

    move-object p1, v4

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    move-object p1, v4

    const/4 p2, 0x1

    :goto_0
    const/4 v1, 0x0

    .line 6
    :goto_1
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v6, v5, :cond_2

    if-nez p2, :cond_2

    .line 7
    iget-object v5, p0, Le/d/a/a/d/d;->c:Le/d/a/a/c/b;

    invoke-virtual {v5}, Le/d/a/a/c/b;->a()Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Le/d/a/a/d/d;->c:Le/d/a/a/c/b;

    .line 8
    invoke-virtual {v5}, Le/d/a/a/c/b;->a()Ljava/util/Date;

    move-result-object v5

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v6}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v5

    if-gez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_2

    .line 9
    iget-object v1, p0, Le/d/a/a/d/d;->c:Le/d/a/a/c/b;

    .line 10
    invoke-virtual {v1}, Le/d/a/a/c/b;->c()Ljava/util/Set;

    move-result-object v1

    .line 11
    invoke-static {p1, v1}, Le/d/a/a/d/d;->a(Ljava/util/List;Ljava/util/Set;)Z

    move-result v1

    xor-int/2addr v1, v2

    :cond_2
    move v8, v1

    if-nez p2, :cond_3

    if-eqz v8, :cond_5

    .line 12
    :cond_3
    sget-object v1, Le/d/a/a/d/e;->c:Le/d/a/a/d/e;

    if-eqz p2, :cond_4

    .line 13
    sget-object v1, Le/d/a/a/d/e;->d:Le/d/a/a/d/e;

    :cond_4
    move-object v7, v1

    .line 14
    invoke-static {}, Le/d/a/a/d/g;->a()Le/d/a/a/e/a;

    move-result-object v1

    iget-object v2, p0, Le/d/a/a/d/d;->b:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v6, p0, Le/d/a/a/d/d;->c:Le/d/a/a/c/b;

    move-object v5, p1

    invoke-virtual/range {v1 .. v7}, Le/d/a/a/e/a;->a(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Le/d/a/a/c/b;Le/d/a/a/d/e;)V

    :cond_5
    if-nez p2, :cond_9

    if-eqz v8, :cond_8

    .line 15
    iget-object p2, p0, Le/d/a/a/d/d;->c:Le/d/a/a/c/b;

    invoke-virtual {p2}, Le/d/a/a/c/b;->e()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n  Configured pins: "

    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    iget-object v0, p0, Le/d/a/a/d/d;->c:Le/d/a/a/c/b;

    invoke-virtual {v0}, Le/d/a/a/c/b;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/d/a/a/c/e;

    .line 20
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    .line 21
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    const-string v0, "\n  Peer certificate chain: "

    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    const-string v1, "\n    "

    .line 24
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Le/d/a/a/c/e;

    invoke-direct {v1, v0}, Le/d/a/a/c/e;-><init>(Ljava/security/cert/Certificate;)V

    .line 25
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    .line 26
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 27
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 28
    :cond_7
    new-instance p1, Ljava/security/cert/CertificateException;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    return-void

    .line 29
    :cond_9
    new-instance p1, Ljava/security/cert/CertificateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Certificate validation failed for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le/d/a/a/d/d;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    return-object v0
.end method
