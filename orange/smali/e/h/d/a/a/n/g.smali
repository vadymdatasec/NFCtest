.class public final Le/h/d/a/a/n/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li/h/c/g;)V
    .locals 0

    invoke-direct {p0}, Le/h/d/a/a/n/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/content/Context;)Le/a/a/s;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Le/h/d/a/a/n/h;->a()Le/a/a/s;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/g;->b(Landroid/content/Context;)V

    .line 3
    :cond_0
    invoke-static {}, Le/h/d/a/a/n/h;->a()Le/a/a/s;

    move-result-object p1

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v1, "volley"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2
    new-instance p1, Le/a/a/s;

    new-instance v1, Le/a/a/c0/i;

    invoke-direct {v1, v0}, Le/a/a/c0/i;-><init>(Ljava/io/File;)V

    new-instance v0, Le/a/a/c0/b;

    new-instance v2, Le/h/d/a/a/n/d;

    invoke-direct {v2}, Le/h/d/a/a/n/d;-><init>()V

    invoke-direct {v0, v2}, Le/a/a/c0/b;-><init>(Le/a/a/c0/a;)V

    const/4 v2, 0x1

    invoke-direct {p1, v1, v0, v2}, Le/a/a/s;-><init>(Le/a/a/b;Le/a/a/j;I)V

    invoke-static {p1}, Le/h/d/a/a/n/h;->a(Le/a/a/s;)V

    .line 3
    invoke-static {}, Le/h/d/a/a/n/h;->a()Le/a/a/s;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le/a/a/s;->b()V

    :goto_0
    return-void
.end method
