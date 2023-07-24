.class public abstract Le/d/a/a/c/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/g;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    const/4 v4, 0x1

    if-eq v1, v4, :cond_2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    .line 3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "domain-config"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p1, v2}, Le/d/a/a/c/m;->a(Lorg/xmlpull/v1/XmlPullParser;Le/d/a/a/c/a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 5
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "debug-overrides"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-static {p0, p1}, Le/d/a/a/c/m;->b(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/i;

    move-result-object v3

    .line 7
    :cond_1
    :goto_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    goto :goto_0

    .line 8
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/d/a/a/c/a;

    .line 10
    invoke-virtual {v0}, Le/d/a/a/c/a;->a()Le/d/a/a/c/b;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    if-eqz v3, :cond_5

    .line 12
    new-instance p1, Le/d/a/a/c/g;

    iget-boolean v0, v3, Le/d/a/a/c/i;->a:Z

    iget-object v1, v3, Le/d/a/a/c/i;->b:Ljava/util/Set;

    invoke-direct {p1, p0, v0, v1}, Le/d/a/a/c/g;-><init>(Ljava/util/Set;ZLjava/util/Set;)V

    goto :goto_3

    .line 13
    :cond_5
    new-instance p1, Le/d/a/a/c/g;

    invoke-direct {p1, p0}, Le/d/a/a/c/g;-><init>(Ljava/util/Set;)V

    :goto_3
    return-object p1
.end method

.method public static a(Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/j;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "domain"

    .line 37
    invoke-interface {p0, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 38
    new-instance v1, Le/d/a/a/c/j;

    invoke-direct {v1, v0}, Le/d/a/a/c/j;-><init>(Le/d/a/a/c/h;)V

    const-string v2, "includeSubdomains"

    .line 39
    invoke-interface {p0, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 40
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Le/d/a/a/c/j;->a:Ljava/lang/Boolean;

    .line 41
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Le/d/a/a/c/j;->b:Ljava/lang/String;

    return-object v1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    const-string v1, "@"

    .line 42
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 44
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public static a(Lorg/xmlpull/v1/XmlPullParser;Le/d/a/a/c/a;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Le/d/a/a/c/a;",
            ")",
            "Ljava/util/List<",
            "Le/d/a/a/c/a;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    const-string v1, "domain-config"

    const/4 v2, 0x0

    .line 14
    invoke-interface {p0, v0, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 15
    new-instance v2, Le/d/a/a/c/a;

    invoke-direct {v2}, Le/d/a/a/c/a;-><init>()V

    .line 16
    invoke-virtual {v2, p1}, Le/d/a/a/c/a;->a(Le/d/a/a/c/a;)Le/d/a/a/c/a;

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    :goto_0
    const/4 v4, 0x3

    if-ne v3, v4, :cond_1

    .line 20
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    return-object p1

    :cond_1
    :goto_1
    if-ne v3, v0, :cond_5

    .line 21
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 22
    invoke-static {p0, v2}, Le/d/a/a/c/m;->a(Lorg/xmlpull/v1/XmlPullParser;Le/d/a/a/c/a;)Ljava/util/List;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 23
    :cond_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "domain"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 24
    invoke-static {p0}, Le/d/a/a/c/m;->a(Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/j;

    move-result-object v3

    .line 25
    iget-object v4, v3, Le/d/a/a/c/j;->b:Ljava/lang/String;

    invoke-virtual {v2, v4}, Le/d/a/a/c/a;->a(Ljava/lang/String;)Le/d/a/a/c/a;

    iget-object v3, v3, Le/d/a/a/c/j;->a:Ljava/lang/Boolean;

    .line 26
    invoke-virtual {v2, v3}, Le/d/a/a/c/a;->c(Ljava/lang/Boolean;)Le/d/a/a/c/a;

    goto :goto_2

    .line 27
    :cond_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "pin-set"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 28
    invoke-static {p0}, Le/d/a/a/c/m;->b(Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/k;

    move-result-object v3

    .line 29
    iget-object v4, v3, Le/d/a/a/c/k;->b:Ljava/util/Set;

    invoke-virtual {v2, v4}, Le/d/a/a/c/a;->a(Ljava/util/Set;)Le/d/a/a/c/a;

    iget-object v3, v3, Le/d/a/a/c/k;->a:Ljava/util/Date;

    .line 30
    invoke-virtual {v2, v3}, Le/d/a/a/c/a;->a(Ljava/util/Date;)Le/d/a/a/c/a;

    goto :goto_2

    .line 31
    :cond_4
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "trustkit-config"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 32
    invoke-static {p0}, Le/d/a/a/c/m;->c(Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/l;

    move-result-object v3

    .line 33
    iget-object v4, v3, Le/d/a/a/c/l;->c:Ljava/util/Set;

    invoke-virtual {v2, v4}, Le/d/a/a/c/a;->b(Ljava/util/Set;)Le/d/a/a/c/a;

    iget-object v4, v3, Le/d/a/a/c/l;->a:Ljava/lang/Boolean;

    .line 34
    invoke-virtual {v2, v4}, Le/d/a/a/c/a;->b(Ljava/lang/Boolean;)Le/d/a/a/c/a;

    iget-object v3, v3, Le/d/a/a/c/l;->b:Ljava/lang/Boolean;

    .line 35
    invoke-virtual {v2, v3}, Le/d/a/a/c/a;->a(Ljava/lang/Boolean;)Le/d/a/a/c/a;

    .line 36
    :cond_5
    :goto_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/i;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "debug-overrides"

    .line 19
    invoke-interface {p1, v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 20
    new-instance v2, Le/d/a/a/c/i;

    invoke-direct {v2, v1}, Le/d/a/a/c/i;-><init>(Le/d/a/a/c/h;)V

    .line 21
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 22
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    move-object v5, v1

    :goto_0
    const/4 v6, 0x3

    if-ne v4, v6, :cond_3

    .line 23
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "trust-anchors"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v5, :cond_1

    .line 24
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iput-boolean p0, v2, Le/d/a/a/c/i;->a:Z

    .line 25
    :cond_1
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result p0

    if-lez p0, :cond_2

    .line 26
    iput-object v3, v2, Le/d/a/a/c/i;->b:Ljava/util/Set;

    :cond_2
    return-object v2

    :cond_3
    :goto_1
    if-ne v4, v0, :cond_6

    .line 27
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v6, "certificates"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const-string v4, "overridePins"

    .line 28
    invoke-interface {p1, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    if-eqz v5, :cond_4

    .line 29
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eq v5, v4, :cond_4

    const/4 v4, 0x0

    .line 30
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "Warning: different values for overridePins are set in the policy but TrustKit only supports one value; using overridePins=false for all connections"

    .line 31
    invoke-static {v5}, Le/d/a/a/f/a;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 32
    :cond_4
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :goto_2
    move-object v5, v4

    const-string v4, "src"

    .line 33
    invoke-interface {p1, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-static {p0, v4}, Le/d/a/a/c/m;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 35
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_5

    const-string v6, "user"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    const-string v6, "system"

    .line 36
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    const-string v6, "@raw"

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 38
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const-string v8, "/"

    .line 39
    invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x1

    aget-object v4, v4, v8

    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "raw"

    .line 41
    invoke-virtual {v7, v4, v9, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 42
    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v4

    const-string v6, "X.509"

    .line 43
    invoke-static {v6}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v6

    .line 44
    invoke-virtual {v6, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v4

    .line 45
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    const-string v4, "No <debug-overrides> certificates found by TrustKit. Please check your @raw folder (TrustKit doesn\'t support system and user installed certificates)."

    .line 46
    invoke-static {v4}, Le/d/a/a/f/a;->a(Ljava/lang/String;)V

    .line 47
    :cond_6
    :goto_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    goto/16 :goto_0
.end method

.method public static b(Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/k;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    const-string v0, "Invalid expiration date in pin-set"

    const-string v1, "pin-set"

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 1
    invoke-interface {p0, v2, v3, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v4, Le/d/a/a/c/k;

    invoke-direct {v4, v3}, Le/d/a/a/c/k;-><init>(Le/d/a/a/c/h;)V

    .line 3
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    iput-object v5, v4, Le/d/a/a/c/k;->b:Ljava/util/Set;

    const-string v5, "expiration"

    .line 4
    invoke-interface {p0, v3, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 5
    :try_start_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v7, "yyyy-MM-dd"

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v6, v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const/4 v7, 0x0

    .line 6
    invoke-virtual {v6, v7}, Ljava/text/SimpleDateFormat;->setLenient(Z)V

    .line 7
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 8
    iput-object v5, v4, Le/d/a/a/c/k;->a:Ljava/util/Date;

    goto :goto_0

    .line 9
    :cond_0
    new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException;

    invoke-direct {p0, v0}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :catch_0
    new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException;

    invoke-direct {p0, v0}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 11
    :cond_1
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    :goto_1
    const/4 v5, 0x3

    if-ne v0, v5, :cond_3

    .line 12
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    return-object v4

    :cond_3
    :goto_2
    if-ne v0, v2, :cond_5

    .line 13
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v5, "pin"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "digest"

    .line 14
    invoke-interface {p0, v3, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v5, "SHA-256"

    .line 15
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 16
    iget-object v0, v4, Le/d/a/a/c/k;->b:Ljava/util/Set;

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 17
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected digest value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 18
    :cond_5
    :goto_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    goto :goto_1
.end method

.method public static c(Lorg/xmlpull/v1/XmlPullParser;)Le/d/a/a/c/l;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    const-string v0, "trustkit-config"

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 1
    invoke-interface {p0, v1, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v3, Le/d/a/a/c/l;

    invoke-direct {v3, v2}, Le/d/a/a/c/l;-><init>(Le/d/a/a/c/h;)V

    .line 3
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const-string v5, "enforcePinning"

    .line 4
    invoke-interface {p0, v2, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 5
    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v3, Le/d/a/a/c/l;->a:Ljava/lang/Boolean;

    :cond_0
    const-string v5, "disableDefaultReportUri"

    .line 6
    invoke-interface {p0, v2, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v3, Le/d/a/a/c/l;->b:Ljava/lang/Boolean;

    .line 8
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    :goto_0
    const/4 v5, 0x3

    if-ne v2, v5, :cond_3

    .line 9
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    iput-object v4, v3, Le/d/a/a/c/l;->c:Ljava/util/Set;

    return-object v3

    :cond_3
    :goto_1
    if-ne v2, v1, :cond_4

    .line 11
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v5, "report-uri"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 12
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_4
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    goto :goto_0
.end method
