.class public Le/b/a/y/w/w/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/w/e<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Landroid/net/Uri;

.field public final c:Le/b/a/y/w/w/g;

.field public d:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Le/b/a/y/w/w/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/w/w/e;->b:Landroid/net/Uri;

    .line 3
    iput-object p2, p0, Le/b/a/y/w/w/e;->c:Le/b/a/y/w/w/g;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;)Le/b/a/y/w/w/e;
    .locals 2

    .line 1
    new-instance v0, Le/b/a/y/w/w/c;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, Le/b/a/y/w/w/c;-><init>(Landroid/content/ContentResolver;)V

    invoke-static {p0, p1, v0}, Le/b/a/y/w/w/e;->a(Landroid/content/Context;Landroid/net/Uri;Le/b/a/y/w/w/f;)Le/b/a/y/w/w/e;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;Le/b/a/y/w/w/f;)Le/b/a/y/w/w/e;
    .locals 3

    .line 2
    invoke-static {p0}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/d;->b()Le/b/a/y/x/f1/b;

    move-result-object v0

    .line 3
    new-instance v1, Le/b/a/y/w/w/g;

    .line 4
    invoke-static {p0}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object v2

    invoke-virtual {v2}, Le/b/a/d;->g()Lcom/bumptech/glide/Registry;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/Registry;->a()Ljava/util/List;

    move-result-object v2

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-direct {v1, v2, p2, v0, p0}, Le/b/a/y/w/w/g;-><init>(Ljava/util/List;Le/b/a/y/w/w/f;Le/b/a/y/x/f1/b;Landroid/content/ContentResolver;)V

    .line 6
    new-instance p0, Le/b/a/y/w/w/e;

    invoke-direct {p0, p1, v1}, Le/b/a/y/w/w/e;-><init>(Landroid/net/Uri;Le/b/a/y/w/w/g;)V

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/net/Uri;)Le/b/a/y/w/w/e;
    .locals 2

    .line 1
    new-instance v0, Le/b/a/y/w/w/d;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, Le/b/a/y/w/w/d;-><init>(Landroid/content/ContentResolver;)V

    invoke-static {p0, p1, v0}, Le/b/a/y/w/w/e;->a(Landroid/content/Context;Landroid/net/Uri;Le/b/a/y/w/w/f;)Le/b/a/y/w/w/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 12
    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public a(Le/b/a/n;Le/b/a/y/w/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/n;",
            "Le/b/a/y/w/d<",
            "-",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    .line 7
    :try_start_0
    invoke-virtual {p0}, Le/b/a/y/w/w/e;->d()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/w/w/e;->d:Ljava/io/InputStream;

    .line 8
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x3

    const-string v1, "MediaStoreThumbFetcher"

    .line 9
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to find thumbnail file"

    .line 10
    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    :cond_0
    invoke-interface {p2, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 2
    iget-object v0, p0, Le/b/a/y/w/w/e;->d:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public c()Le/b/a/y/a;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/a;->b:Le/b/a/y/a;

    return-object v0
.end method

.method public cancel()V
    .locals 0

    return-void
.end method

.method public final d()Ljava/io/InputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/w/w/e;->c:Le/b/a/y/w/w/g;

    iget-object v1, p0, Le/b/a/y/w/w/e;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Le/b/a/y/w/w/g;->c(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, p0, Le/b/a/y/w/w/e;->c:Le/b/a/y/w/w/g;

    iget-object v3, p0, Le/b/a/y/w/w/e;->b:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Le/b/a/y/w/w/g;->a(Landroid/net/Uri;)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    if-eq v2, v1, :cond_1

    .line 3
    new-instance v1, Le/b/a/y/w/k;

    invoke-direct {v1, v0, v2}, Le/b/a/y/w/k;-><init>(Ljava/io/InputStream;I)V

    move-object v0, v1

    :cond_1
    return-object v0
.end method
