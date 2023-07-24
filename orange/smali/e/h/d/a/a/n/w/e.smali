.class public Le/h/d/a/a/n/w/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Le/h/d/a/a/n/w/b;

.field public final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/n/w/e;->c:Landroid/content/Context;

    .line 3
    iput-boolean p3, p0, Le/h/d/a/a/n/w/e;->a:Z

    .line 4
    invoke-static {p1, p3}, Le/h/d/a/a/n/w/b;->c(Landroid/content/Context;Z)Le/h/d/a/a/n/w/b;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/n/w/e;->b:Le/h/d/a/a/n/w/b;

    .line 5
    invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->e()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/g/u/i;

    invoke-direct {p1}, Lcom/orange/oab/contactless/packid/g/u/i;-><init>()V

    throw p1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->e()Z

    move-result p1

    if-nez p1, :cond_2

    if-eqz p4, :cond_2

    .line 8
    invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->b()V

    :cond_2
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Le/h/d/a/a/n/w/e;->e(Landroid/content/Context;Z)V

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Le/h/d/a/a/n/w/e;->e(Landroid/content/Context;Z)V

    return-void
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 2

    .line 3
    invoke-static {p0, p1}, Le/h/d/a/a/n/w/e;->b(Landroid/content/Context;Z)Ljava/io/File;

    move-result-object p0

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "deleteSecretKeyFile "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "packid.SecretKeyRepo"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t delete secretKeyConfigurationFile, "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " do not exists."

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;Z)Ljava/io/File;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    if-eqz p1, :cond_0

    const-string p1, "privatekey.cfg"

    goto :goto_0

    :cond_0
    const-string p1, "privateunsecuredkey.cfg"

    :goto_0
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Z)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le/h/d/a/a/n/w/e;->b(Landroid/content/Context;Z)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0
.end method

.method public static d(Landroid/content/Context;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Le/h/d/a/a/n/w/b;->c(Landroid/content/Context;Z)Le/h/d/a/a/n/w/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Le/h/d/a/a/n/w/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Le/h/d/a/a/n/w/e;->c(Landroid/content/Context;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Landroid/content/Context;Z)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Le/h/d/a/a/n/w/b;->c(Landroid/content/Context;Z)Le/h/d/a/a/n/w/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Le/h/d/a/a/n/w/b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Le/h/d/a/a/n/w/b;->b()V

    .line 4
    :cond_0
    invoke-static {p0, p1}, Le/h/d/a/a/n/w/e;->a(Landroid/content/Context;Z)V
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    const-string p1, "packid.SecretKeyRepo"

    const-string v0, "Fail to reset SecretKeyRepository"

    .line 5
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 12
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/n/w/e;->c:Landroid/content/Context;

    iget-boolean v1, p0, Le/h/d/a/a/n/w/e;->a:Z

    invoke-static {v0, v1}, Le/h/d/a/a/n/w/e;->b(Landroid/content/Context;Z)Ljava/io/File;

    move-result-object v0

    invoke-static {p1, v0}, Le/f/b/c/s;->a([BLjava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "packid.SecretKeyRepo"

    const-string v1, "Can\'t write Private Key configuration file"

    .line 13
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 14
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e;

    const-string v1, "Could not create secret key"

    invoke-direct {v0, v1, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public a()[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "Unexpected secret key!"

    .line 7
    :try_start_0
    invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->d()[B

    move-result-object v1

    .line 8
    iget-object v2, p0, Le/h/d/a/a/n/w/e;->b:Le/h/d/a/a/n/w/b;

    invoke-virtual {v2, v1}, Le/h/d/a/a/n/w/b;->b([B)[B

    move-result-object v1

    .line 9
    array-length v2, v1

    if-eqz v2, :cond_0

    return-object v1

    .line 10
    :cond_0
    new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 11
    :goto_0
    new-instance v2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v2, v0, v1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2
.end method

.method public final b()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "packid.SecretKeyRepo"

    .line 2
    :try_start_0
    iget-object v1, p0, Le/h/d/a/a/n/w/e;->b:Le/h/d/a/a/n/w/b;

    iget-boolean v2, p0, Le/h/d/a/a/n/w/e;->a:Z

    invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/b;->a(Z)V

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Creating AES secret "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Le/h/d/a/a/n/w/e;->a:Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "secured"

    const-string v4, "unsecured"

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " key file..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0}, Le/h/d/a/a/n/w/e;->c()Ljavax/crypto/SecretKey;

    move-result-object v1

    .line 5
    iget-object v2, p0, Le/h/d/a/a/n/w/e;->b:Le/h/d/a/a/n/w/b;

    invoke-interface {v1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Le/h/d/a/a/n/w/b;->a([B)[B

    move-result-object v1

    .line 6
    invoke-virtual {p0, v1}, Le/h/d/a/a/n/w/e;->a([B)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AES secret "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Le/h/d/a/a/n/w/e;->a:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " key file created"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v2, "createSecretKey exception"

    .line 8
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 9
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method public final c()Ljavax/crypto/SecretKey;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    const-string v0, "AES"

    .line 2
    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v2, 0x100

    invoke-virtual {v0, v2, v1}, Ljavax/crypto/KeyGenerator;->init(ILjava/security/SecureRandom;)V

    .line 4
    invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v0

    return-object v0
.end method

.method public final d()[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 3
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/n/w/e;->c:Landroid/content/Context;

    iget-boolean v1, p0, Le/h/d/a/a/n/w/e;->a:Z

    invoke-static {v0, v1}, Le/h/d/a/a/n/w/e;->b(Landroid/content/Context;Z)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Le/f/b/c/s;->b(Ljava/io/File;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 4
    new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e;

    const-string v2, "Could not read secret key"

    invoke-direct {v1, v2, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public final e()Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 6
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/n/w/e;->c:Landroid/content/Context;

    iget-boolean v1, p0, Le/h/d/a/a/n/w/e;->a:Z

    invoke-static {v0, v1}, Le/h/d/a/a/n/w/e;->d(Landroid/content/Context;Z)Z

    move-result v0
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    const-string v1, "packid.SecretKeyRepo"

    const-string v2, "isSecretKeyExist exception"

    .line 7
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 8
    new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method
