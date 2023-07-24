.class public Le/h/d/a/a/n/w/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Le/h/d/a/a/n/w/d;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/n/w/d;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Le/h/d/a/a/n/w/d;->b:Le/h/d/a/a/n/w/d;

    if-nez v0, :cond_0

    const-string v0, "packid.KeyStoreManager"

    const-string v1, "KeyStoreManager Initialised"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Le/h/d/a/a/n/w/d;

    invoke-direct {v0, p0}, Le/h/d/a/a/n/w/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Le/h/d/a/a/n/w/d;->b:Le/h/d/a/a/n/w/d;

    :cond_0
    return-void
.end method

.method public static c()Le/h/d/a/a/n/w/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/g;
        }
    .end annotation

    .line 1
    sget-object v0, Le/h/d/a/a/n/w/d;->b:Le/h/d/a/a/n/w/d;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/g/u/g;

    const-string v1, "need to call init"

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/g/u/g;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Ljava/security/KeyStore$SecretKeyEntry;)Landroid/security/keystore/KeyInfo;
    .locals 2

    .line 75
    :try_start_0
    invoke-virtual {p1}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AndroidKeyStore"

    invoke-static {v0, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    .line 76
    invoke-virtual {p1}, Ljava/security/KeyStore$SecretKeyEntry;->getSecretKey()Ljavax/crypto/SecretKey;

    move-result-object p1

    const-class v1, Landroid/security/keystore/KeyInfo;

    invoke-virtual {v0, p1, v1}, Ljavax/crypto/SecretKeyFactory;->getKeySpec(Ljavax/crypto/SecretKey;Ljava/lang/Class;)Ljava/security/spec/KeySpec;

    move-result-object p1

    check-cast p1, Landroid/security/keystore/KeyInfo;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "packid.KeyStoreManager"

    const-string v0, "Unable to fetch Secret Key Info"

    .line 77
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Z)Landroid/security/keystore/KeyProtection;
    .locals 6

    .line 14
    new-instance v0, Landroid/security/keystore/KeyProtection$Builder;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;-><init>(I)V

    const-string v1, "CBC"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyProtection$Builder;

    move-result-object v0

    const-string v1, "PKCS7Padding"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyProtection$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setRandomizedEncryptionRequired(Z)Landroid/security/keystore/KeyProtection$Builder;

    move-result-object v0

    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v2}, Landroid/security/keystore/KeyProtection$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyProtection$Builder;

    move-result-object v0

    const v3, 0x278d00

    .line 19
    invoke-virtual {v0, v3}, Landroid/security/keystore/KeyProtection$Builder;->setUserAuthenticationValidityDurationSeconds(I)Landroid/security/keystore/KeyProtection$Builder;

    move-result-object v0

    .line 20
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v4, "packid.KeyStoreManager"

    const/16 v5, 0x1f

    if-lt v3, v5, :cond_0

    iget-object v3, p0, Le/h/d/a/a/n/w/d;->a:Landroid/content/Context;

    invoke-static {v3}, Le/h/a/a/a/a/b;->a(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 21
    invoke-virtual {v0, p1}, Landroid/security/keystore/KeyProtection$Builder;->setIsStrongBoxBacked(Z)Landroid/security/keystore/KeyProtection$Builder;

    .line 22
    iget-object p1, p0, Le/h/d/a/a/n/w/d;->a:Landroid/content/Context;

    invoke-static {p1, v2}, Le/h/a/a/a/a/b;->b(Landroid/content/Context;Z)V

    .line 23
    :try_start_0
    invoke-virtual {v0}, Landroid/security/keystore/KeyProtection$Builder;->build()Landroid/security/keystore/KeyProtection;

    move-result-object p1
    :try_end_0
    .catch Landroid/security/keystore/StrongBoxUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "unable to put key in secure element falling back to TEE"

    .line 24
    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyProtection$Builder;->setIsStrongBoxBacked(Z)Landroid/security/keystore/KeyProtection$Builder;

    :cond_0
    const-string p1, "API 31 version requirement not met in secure element falling back to TEE"

    .line 26
    invoke-static {v4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    invoke-virtual {v0}, Landroid/security/keystore/KeyProtection$Builder;->build()Landroid/security/keystore/KeyProtection;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/security/KeyStore;)Ljava/security/KeyStore$SecretKeyEntry;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/UnrecoverableEntryException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const/4 v0, 0x0

    .line 67
    invoke-virtual {p2, p1, v0}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object v1

    check-cast v1, Ljava/security/KeyStore$SecretKeyEntry;

    .line 68
    invoke-virtual {p0, v1}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore$SecretKeyEntry;)Landroid/security/keystore/KeyInfo;

    move-result-object v2

    .line 69
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v4, "packid.KeyStoreManager"

    const/16 v5, 0x1f

    if-lt v3, v5, :cond_1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/security/keystore/KeyInfo;->getSecurityLevel()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    :cond_0
    iget-object v2, p0, Le/h/d/a/a/n/w/d;->a:Landroid/content/Context;

    .line 70
    invoke-static {v2}, Le/h/a/a/a/a/b;->a(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v1, "Secret Key is not in secure element Migrating to secure element"

    .line 71
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;)Z

    .line 73
    invoke-virtual {p2, p1, v0}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/security/KeyStore$SecretKeyEntry;

    goto :goto_0

    :cond_1
    const-string p1, "Secure Element Migration is not needed"

    .line 74
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v1
.end method

.method public a(Ljava/security/KeyStore;Ljava/lang/String;[B)Ljava/security/KeyStore$SecretKeyEntry;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/UnrecoverableEntryException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 78
    invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "packid.KeyStoreManager"

    if-eqz v0, :cond_0

    const-string p3, "RSA TO AES Migration is already done !!!"

    .line 79
    invoke-static {v1, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/w/d;->a(Ljava/lang/String;Ljava/security/KeyStore;)Ljava/security/KeyStore$SecretKeyEntry;

    move-result-object p1

    return-object p1

    .line 81
    :cond_0
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/w/d;->b(Ljava/security/KeyStore;Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    const-string v3, "PACKID"

    if-eqz v0, :cond_2

    const-string v0, "RSA TO AES Migration is needed !!!"

    .line 82
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "NFCO"

    goto :goto_0

    :cond_1
    const-string v0, "UNSECURED_NFCO"

    :goto_0
    invoke-virtual {p0, p1, p3, v0, p2}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;[BLjava/lang/String;Ljava/lang/String;)Z

    .line 84
    invoke-virtual {p1, p2, v2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object p1

    check-cast p1, Ljava/security/KeyStore$SecretKeyEntry;

    return-object p1

    :cond_2
    const-string p3, "No migration needed generating new AES key !!!"

    .line 85
    invoke-static {v1, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p3, v0, :cond_3

    .line 87
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Le/h/d/a/a/n/w/d;->b(Ljava/security/KeyStore;Ljava/lang/String;Z)Z

    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;Z)Z

    .line 89
    :goto_1
    invoke-virtual {p1, p2, v2}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object p1

    check-cast p1, Ljava/security/KeyStore$SecretKeyEntry;

    return-object p1
.end method

.method public a()Ljava/security/KeyStore;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    :try_start_0
    const-string v0, "AndroidKeyStore"

    .line 4
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
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

    .line 6
    :goto_0
    new-instance v1, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {v1, v0}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method public final a(ZLjava/lang/String;)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    .line 28
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const/16 p2, 0x100

    .line 29
    invoke-virtual {v0, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p2

    const-string v1, "CBC"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-virtual {p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p2

    const-string v1, "PKCS7Padding"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-virtual {p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p2

    const/4 v1, 0x0

    .line 32
    invoke-virtual {p2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setRandomizedEncryptionRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p2

    .line 33
    invoke-virtual {p2, p1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p1

    const p2, 0x278d00

    .line 34
    invoke-virtual {p1, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationValidityDurationSeconds(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const-string p1, "packid.KeyStoreManager"

    const-string p2, "Need API version 28 to use Secure Element falling back to TEE "

    .line 35
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object p1

    return-object p1
.end method

.method public final a(ZZLjava/lang/String;)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/security/keystore/StrongBoxUnavailableException;
        }
    .end annotation

    .line 37
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v1, 0x3

    invoke-direct {v0, p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const/16 p3, 0x100

    .line 38
    invoke-virtual {v0, p3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p3

    const-string v1, "CBC"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p3

    const-string v1, "PKCS7Padding"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 40
    invoke-virtual {p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p3

    const/4 v1, 0x0

    .line 41
    invoke-virtual {p3, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setRandomizedEncryptionRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p3

    .line 42
    invoke-virtual {p3, p1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p1

    const p3, 0x278d00

    .line 43
    invoke-virtual {p1, p3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationValidityDurationSeconds(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object p1

    .line 44
    invoke-virtual {p1, p2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setIsStrongBoxBacked(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const-string p1, "packid.KeyStoreManager"

    if-eqz p2, :cond_0

    const-string p2, "Try to PUT Key in secure ELEMENT !!!"

    .line 45
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string p2, "Falling Back to TEE"

    .line 46
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    :goto_0
    iget-object p1, p0, Le/h/d/a/a/n/w/d;->a:Landroid/content/Context;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Le/h/a/a/a/a/b;->b(Landroid/content/Context;Z)V

    .line 48
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/security/KeyStore;Ljava/lang/String;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "packid.KeyStoreManager"

    .line 58
    iget-object v1, p0, Le/h/d/a/a/n/w/d;->a:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Le/h/a/a/a/a/b;->b(Landroid/content/Context;Z)V

    const/4 v1, 0x0

    .line 59
    :try_start_0
    invoke-virtual {p1, p2, v1}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    move-result-object v1

    .line 60
    instance-of v3, v1, Ljavax/crypto/SecretKey;

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v3

    if-eqz v3, :cond_0

    .line 61
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    invoke-interface {v1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    const-string v4, "AES"

    invoke-direct {v3, v1, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 62
    new-instance v1, Ljava/security/KeyStore$SecretKeyEntry;

    invoke-direct {v1, v3}, Ljava/security/KeyStore$SecretKeyEntry;-><init>(Ljavax/crypto/SecretKey;)V

    .line 63
    invoke-virtual {p0, v2}, Le/h/d/a/a/n/w/d;->a(Z)Landroid/security/keystore/KeyProtection;

    move-result-object v3

    invoke-virtual {p1, p2, v1, v3}, Ljava/security/KeyStore;->setEntry(Ljava/lang/String;Ljava/security/KeyStore$Entry;Ljava/security/KeyStore$ProtectionParameter;)V

    return v2

    :cond_0
    const-string p1, "Unable to fetch the secret key : it\'s already StrongBoxBacked \nThe migration is not needed"

    .line 64
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/UnrecoverableKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    const-string p2, "Fail to migrateExistingAEStoSecureElement"

    .line 65
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public a(Ljava/security/KeyStore;Ljava/lang/String;Z)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "packid.KeyStoreManager"

    const-string v1, "Try to generate new AES Key"

    .line 49
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    const-string v1, "AES"

    const-string v2, "AndroidKeyStore"

    .line 50
    invoke-static {v1, v2}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v1

    .line 51
    invoke-virtual {p0, p3, p2}, Le/h/d/a/a/n/w/d;->a(ZLjava/lang/String;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 52
    invoke-virtual {v1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    .line 53
    invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Generated New AES Key Success"

    .line 54
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string p1, "Generated New AES Key FAILED"

    .line 55
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    :goto_0
    const-string p2, "Fail to generateNewAESKey"

    .line 56
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public a(Ljava/security/KeyStore;[BLjava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 7
    :try_start_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 8
    new-instance p2, Ljava/security/KeyStore$SecretKeyEntry;

    invoke-direct {p2, v0}, Ljava/security/KeyStore$SecretKeyEntry;-><init>(Ljavax/crypto/SecretKey;)V

    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0}, Le/h/d/a/a/n/w/d;->a(Z)Landroid/security/keystore/KeyProtection;

    move-result-object v1

    invoke-virtual {p1, p4, p2, v1}, Ljava/security/KeyStore;->setEntry(Ljava/lang/String;Ljava/security/KeyStore$Entry;Ljava/security/KeyStore$ProtectionParameter;)V

    .line 10
    invoke-virtual {p1, p4}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 11
    invoke-virtual {p1, p3}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1

    :catch_0
    move-exception p1

    const-string p2, "packid.KeyStoreManager"

    const-string p3, "Fail to handleRSATOAESMigration"

    .line 12
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 13
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .line 16
    invoke-virtual {p0}, Le/h/d/a/a/n/w/d;->a()Ljava/security/KeyStore;

    move-result-object v0

    const-string v1, "PACKID"

    .line 17
    invoke-virtual {v0, v1}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V

    const-string v1, "UNSECURED_PACKID"

    .line 18
    invoke-virtual {v0, v1}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/security/KeyStore;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    :try_start_0
    const-string v0, "PACKID"

    .line 1
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "NFCO"

    .line 2
    invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const-string p2, "UNSECURED_NFCO"

    .line 3
    invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 4
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public b(Ljava/security/KeyStore;Ljava/lang/String;Z)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "packid.KeyStoreManager"

    const-string v1, "Try to generate new AES Key"

    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "AES"

    const-string v3, "AndroidKeyStore"

    .line 6
    invoke-static {v2, v3}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v2

    .line 7
    iget-object v3, p0, Le/h/d/a/a/n/w/d;->a:Landroid/content/Context;

    invoke-static {v3}, Le/h/a/a/a/a/b;->a(Landroid/content/Context;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    invoke-virtual {p0, p3, v3, p2}, Le/h/d/a/a/n/w/d;->a(ZZLjava/lang/String;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 8
    invoke-virtual {v2}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    .line 9
    invoke-virtual {p1, p2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    const-string p3, "Generated New AES Key Success"

    .line 10
    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    :cond_0
    const-string p3, "Generated New AES Key FAILED"

    .line 11
    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/security/keystore/StrongBoxUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    const-string p3, "unable to put key in secure element falling back to TEE"

    .line 12
    invoke-static {v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    invoke-virtual {p0, p1, p2, v1}, Le/h/d/a/a/n/w/d;->a(Ljava/security/KeyStore;Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    :goto_0
    const-string p2, "Fail to generateNewAESKey"

    .line 14
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 15
    new-instance p2, Lcom/orange/oab/contactless/packid/g/u/e;

    invoke-direct {p2, p1}, Lcom/orange/oab/contactless/packid/g/u/e;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method
