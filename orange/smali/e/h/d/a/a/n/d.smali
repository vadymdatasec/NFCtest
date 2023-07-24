.class public Le/h/d/a/a/n/d;
.super Le/a/a/c0/n;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/a/a/c0/n;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Le/a/a/c0/n;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 3
    instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Le/d/a/a/b;->b()Le/d/a/a/b;

    move-result-object v1

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/d/a/a/b;->a(Ljava/lang/String;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p1

    .line 5
    move-object v1, v0

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v1, p1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    invoke-virtual {p1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->isHttpAccepted()Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-object v0

    .line 7
    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLException;

    const-string v0, "HTTPS required!"

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
