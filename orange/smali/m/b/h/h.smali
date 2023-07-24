.class public Lm/b/h/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm/b/f;


# instance fields
.field public a:Lm/b/d;

.field public b:Lm/b/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lm/b/h/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/b/h/d;-><init>(Lm/b/h/b;)V

    iput-object v0, p0, Lm/b/h/h;->a:Lm/b/d;

    .line 3
    new-instance v0, Lm/b/h/g;

    invoke-direct {v0}, Lm/b/h/g;-><init>()V

    iput-object v0, p0, Lm/b/h/h;->b:Lm/b/e;

    return-void
.end method

.method public static synthetic a(Ljava/net/URL;)Ljava/net/URL;
    .locals 0

    .line 1
    invoke-static {p0}, Lm/b/h/h;->b(Ljava/net/URL;)Ljava/net/URL;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lm/b/d;)Z
    .locals 0

    .line 2
    invoke-static {p0}, Lm/b/h/h;->b(Lm/b/d;)Z

    move-result p0

    return p0
.end method

.method public static b(Ljava/net/URL;)Ljava/net/URL;
    .locals 9

    .line 1
    :try_start_0
    new-instance v8, Ljava/net/URI;

    invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ljava/net/URL;->getPort()I

    move-result v4

    invoke-virtual {p0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/net/URL;

    invoke-virtual {v8}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object p0
.end method

.method public static b(Lm/b/d;)Z
    .locals 1

    .line 5
    invoke-interface {p0}, Lm/b/d;->n()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/b/b;

    .line 6
    invoke-interface {v0}, Lm/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic d(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lm/b/h/h;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Lm/b/f;
    .locals 1

    .line 1
    new-instance v0, Lm/b/h/h;

    invoke-direct {v0}, Lm/b/h/h;-><init>()V

    .line 2
    invoke-interface {v0, p0}, Lm/b/f;->c(Ljava/lang/String;)Lm/b/f;

    return-object v0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "\""

    const-string v1, "%22"

    .line 1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-static {v0}, Lm/b/h/h;->b(Ljava/net/URL;)Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method


# virtual methods
.method public a()Lm/b/e;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lm/b/h/h;->a:Lm/b/d;

    invoke-static {v0}, Lm/b/h/g;->b(Lm/b/d;)Lm/b/h/g;

    move-result-object v0

    iput-object v0, p0, Lm/b/h/h;->b:Lm/b/e;

    return-object v0
.end method

.method public a(I)Lm/b/f;
    .locals 1

    .line 3
    iget-object v0, p0, Lm/b/h/h;->a:Lm/b/d;

    invoke-interface {v0, p1}, Lm/b/d;->a(I)Lm/b/d;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lm/b/f;
    .locals 2

    const-string v0, "Referrer must not be null"

    .line 4
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lm/b/h/h;->a:Lm/b/d;

    const-string v1, "Referer"

    invoke-interface {v0, v1, p1}, Lm/b/a;->b(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lm/b/f;
    .locals 2

    const-string v0, "User agent must not be null"

    .line 3
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lm/b/h/h;->a:Lm/b/d;

    const-string v1, "User-Agent"

    invoke-interface {v0, v1, p1}, Lm/b/a;->b(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lm/b/f;
    .locals 4

    const-string v0, "Must supply a valid URL"

    .line 1
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lm/b/h/h;->a:Lm/b/d;

    new-instance v1, Ljava/net/URL;

    invoke-static {p1}, Lm/b/h/h;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lm/b/a;->a(Ljava/net/URL;)Lm/b/a;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Malformed URL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public get()Lm/b/i/i;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lm/b/h/h;->a:Lm/b/d;

    sget-object v1, Lm/b/c;->c:Lm/b/c;

    invoke-interface {v0, v1}, Lm/b/a;->a(Lm/b/c;)Lm/b/a;

    .line 2
    invoke-virtual {p0}, Lm/b/h/h;->a()Lm/b/e;

    .line 3
    iget-object v0, p0, Lm/b/h/h;->b:Lm/b/e;

    invoke-interface {v0}, Lm/b/e;->j()Lm/b/i/i;

    move-result-object v0

    return-object v0
.end method
