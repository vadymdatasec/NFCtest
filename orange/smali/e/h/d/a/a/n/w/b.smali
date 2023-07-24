.class public Le/h/d/a/a/n/w/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/security/KeyStore;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/security/KeyStore;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/n/w/b;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/n/w/b;->b:Ljava/security/KeyStore;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/n/w/b;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Le/h/d/a/a/n/w/b;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-static {}, Le/h/d/a/a/n/w/b;->d()Ljava/security/KeyStore;

    move-result-object v0

    .line 2
    new-instance v1, Le/h/d/a/a/n/w/b;

    invoke-direct {v1, p0, v0, p1}, Le/h/d/a/a/n/w/b;-><init>(Landroid/content/Context;Ljava/security/KeyStore;Ljava/lang/String;)V

    return-object v1
.end method

.method public static c(Landroid/content/Context;Z)Le/h/d/a/a/n/w/b;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    if-eqz p1, :cond_0

    const-string p1, "NFCO"

    goto :goto_0

    :cond_0
    const-string p1, "UNSECURED_NFCO"

    .line 1
    :goto_0
    invoke-static {p0, p1}, Le/h/d/a/a/n/w/b;->a(Landroid/content/Context;Ljava/lang/String;)Le/h/d/a/a/n/w/b;

    move-result-object p0

    return-object p0
.end method

.method public static d()Ljava/security/KeyStore;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    :try_start_0
    const-string v0, "AndroidKeyStore"

    .line 1
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 3
    :goto_0
    new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method


# virtual methods
.method public final a(Landroid/security/KeyPairGeneratorSpec$Builder;Z)Landroid/security/KeyPairGeneratorSpec$Builder;
    .locals 0

    if-eqz p2, :cond_0

    .line 19
    invoke-virtual {p1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setEncryptionRequired()Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final a(Landroid/content/Context;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lcom/orange/oab/contactless/packid/g/u/b;
        }
    .end annotation

    const-string v0, "packid.KeyPairEncryptor"

    .line 7
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateKeyPair secureLockRequired="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "RSA"

    const-string v1, "AndroidKeyStore"

    .line 8
    invoke-static {v0, v1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    .line 9
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/w/b;->b(Landroid/content/Context;Z)Landroid/security/KeyPairGeneratorSpec;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 10
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 11
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/b;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/b;-><init>(Ljava/lang/IllegalStateException;)V

    throw p2
.end method

.method public a(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lcom/orange/oab/contactless/packid/g/u/b;
        }
    .end annotation

    .line 3
    invoke-virtual {p0}, Le/h/d/a/a/n/w/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "packid.KeyPairEncryptor"

    const-string v1, "Creating RSA key pair in android key store...."

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object v1, p0, Le/h/d/a/a/n/w/b;->a:Landroid/content/Context;

    invoke-virtual {p0, v1, p1}, Le/h/d/a/a/n/w/b;->a(Landroid/content/Context;Z)V

    const-string p1, "RSA key pair created in android key store"

    .line 6
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .line 12
    iget-object v0, p0, Le/h/d/a/a/n/w/b;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Le/h/d/a/a/n/w/b;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .line 13
    iget-object v0, p0, Le/h/d/a/a/n/w/b;->b:Ljava/security/KeyStore;

    invoke-virtual {v0, p1}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public a([B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0}, Le/h/d/a/a/n/w/b;->c()Ljava/security/KeyStore$PrivateKeyEntry;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyStore$PrivateKeyEntry;->getCertificate()Ljava/security/cert/Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/n/w/b;->a([BLjava/security/Key;I)[B

    move-result-object p1

    return-object p1
.end method

.method public final a([BLjava/security/Key;I)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const-string v0, "RSA/ECB/PKCS1Padding"

    .line 16
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p3, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 18
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;Z)Landroid/security/KeyPairGeneratorSpec;
    .locals 4

    .line 5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x1

    .line 7
    invoke-virtual {v1, v2, v2}, Ljava/util/Calendar;->add(II)V

    .line 8
    new-instance v2, Landroid/security/KeyPairGeneratorSpec$Builder;

    invoke-direct {v2, p1}, Landroid/security/KeyPairGeneratorSpec$Builder;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljavax/security/auth/x500/X500Principal;

    const-string v3, "CN=NFCO"

    invoke-direct {p1, v3}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v2, p1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSubject(Ljavax/security/auth/x500/X500Principal;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const v3, 0x7fffffff

    .line 10
    invoke-virtual {v2, v3}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSerialNumber(Ljava/math/BigInteger;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    .line 11
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setStartDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    .line 12
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setEndDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    iget-object v0, p0, Le/h/d/a/a/n/w/b;->c:Ljava/lang/String;

    .line 13
    invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setAlias(Ljava/lang/String;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    const/16 v0, 0x800

    .line 14
    invoke-virtual {p1, v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->setKeySize(I)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    .line 15
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/w/b;->a(Landroid/security/KeyPairGeneratorSpec$Builder;Z)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/security/KeyPairGeneratorSpec$Builder;->build()Landroid/security/KeyPairGeneratorSpec;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reset for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/n/w/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.KeyPairEncryptor"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Le/h/d/a/a/n/w/b;->b:Ljava/security/KeyStore;

    iget-object v1, p0, Le/h/d/a/a/n/w/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V

    return-void
.end method

.method public b([B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 3
    invoke-virtual {p0}, Le/h/d/a/a/n/w/b;->c()Ljava/security/KeyStore$PrivateKeyEntry;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyStore$PrivateKeyEntry;->getPrivateKey()Ljava/security/PrivateKey;

    move-result-object v0

    const/4 v1, 0x2

    .line 4
    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/n/w/b;->a([BLjava/security/Key;I)[B

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/security/KeyStore$PrivateKeyEntry;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/n/w/b;->b:Ljava/security/KeyStore;

    iget-object v1, p0, Le/h/d/a/a/n/w/b;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object v0

    check-cast v0, Ljava/security/KeyStore$PrivateKeyEntry;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.KeyPairEncryptor"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/e;

    iget-object v1, p0, Le/h/d/a/a/n/w/b;->a:Landroid/content/Context;

    sget v2, Le/h/d/a/a/c;->error_security_configuration_modified:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/String;)V

    throw v0
.end method
