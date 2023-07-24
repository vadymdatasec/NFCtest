.class public abstract Lm/b/h/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lm/b/a;",
        ">",
        "Ljava/lang/Object;",
        "Lm/b/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/net/URL;

.field public b:Lm/b/c;

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lm/b/h/c;->d:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lm/b/h/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/h/c;-><init>()V

    return-void
.end method

.method public static a([B)Z
    .locals 8

    .line 5
    array-length v0, p0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v0, v1, :cond_2

    aget-byte v0, p0, v2

    and-int/lit16 v0, v0, 0xff

    const/16 v4, 0xef

    if-ne v0, v4, :cond_2

    aget-byte v0, p0, v3

    and-int/lit16 v0, v0, 0xff

    const/16 v4, 0xbb

    if-ne v0, v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v4, 0x2

    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0xbf

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    and-int/2addr v0, v4

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 6
    :goto_2
    array-length v0, p0

    :goto_3
    if-ge v1, v0, :cond_9

    .line 7
    aget-byte v4, p0, v1

    and-int/lit16 v5, v4, 0x80

    if-nez v5, :cond_3

    goto :goto_5

    :cond_3
    and-int/lit16 v5, v4, 0xe0

    const/16 v6, 0xc0

    if-ne v5, v6, :cond_4

    add-int/lit8 v4, v1, 0x1

    goto :goto_4

    :cond_4
    and-int/lit16 v5, v4, 0xf0

    const/16 v7, 0xe0

    if-ne v5, v7, :cond_5

    add-int/lit8 v4, v1, 0x2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v4, 0xf8

    const/16 v5, 0xf0

    if-ne v4, v5, :cond_8

    add-int/lit8 v4, v1, 0x3

    :cond_6
    :goto_4
    if-ge v1, v4, :cond_7

    add-int/lit8 v1, v1, 0x1

    .line 8
    aget-byte v5, p0, v1

    and-int/2addr v5, v6

    const/16 v7, 0x80

    if-eq v5, v7, :cond_6

    return v2

    :cond_7
    :goto_5
    add-int/2addr v1, v3

    goto :goto_3

    :cond_8
    return v2

    :cond_9
    return v3
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    const-string v0, "ISO-8859-1"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 2
    invoke-static {v0}, Lm/b/h/c;->a([B)Z

    move-result v1

    if-nez v1, :cond_0

    return-object p0

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "Cookie name must not be empty"

    .line 11
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Cookie value must not be null"

    .line 12
    invoke-static {p2, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lm/b/h/c;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Ljava/net/URL;)Lm/b/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            ")TT;"
        }
    .end annotation

    const-string v0, "URL must not be null"

    .line 1
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lm/b/h/c;->a:Ljava/net/URL;

    return-object p0
.end method

.method public a(Lm/b/c;)Lm/b/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/b/c;",
            ")TT;"
        }
    .end annotation

    const-string v0, "Method must not be null"

    .line 3
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Lm/b/h/c;->b:Lm/b/c;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Header name must not be empty"

    .line 9
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, p1}, Lm/b/h/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "Header name must not be null"

    .line 5
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_0
    if-nez v0, :cond_1

    .line 8
    invoke-virtual {p0, p1}, Lm/b/h/c;->f(Ljava/lang/String;)Ljava/util/Map$Entry;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lm/b/h/c;->d:Ljava/util/Map;

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "Header name must not be empty"

    .line 1
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Header value must not be null"

    .line 2
    invoke-static {p2, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Lm/b/h/c;->e(Ljava/lang/String;)Lm/b/a;

    .line 4
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Cookie name must not be empty"

    .line 2
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lm/b/h/c;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lm/b/h/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lm/b/h/c;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "Header name must not be null"

    .line 2
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Lm/b/h/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-static {p1}, Lm/b/h/c;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public d()Ljava/net/URL;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/h/c;->a:Ljava/net/URL;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lm/b/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "Header name must not be empty"

    .line 2
    invoke-static {p1, v0}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Lm/b/h/c;->f(Ljava/lang/String;)Ljava/util/Map$Entry;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public e()Lm/b/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/h/c;->b:Lm/b/c;

    return-object v0
.end method

.method public final f(Ljava/lang/String;)Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lm/b/h/c;->c:Ljava/util/Map;

    return-object v0
.end method
