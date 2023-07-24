.class public final Le/b/a/w/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/b/a/w/d;

.field public final b:[Z

.field public c:Z

.field public final synthetic d:Le/b/a/w/f;


# direct methods
.method public constructor <init>(Le/b/a/w/f;Le/b/a/w/d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Le/b/a/w/c;->d:Le/b/a/w/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Le/b/a/w/c;->a:Le/b/a/w/d;

    .line 4
    invoke-static {p2}, Le/b/a/w/d;->d(Le/b/a/w/d;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Le/b/a/w/f;->b(Le/b/a/w/f;)I

    move-result p1

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Le/b/a/w/c;->b:[Z

    return-void
.end method

.method public synthetic constructor <init>(Le/b/a/w/f;Le/b/a/w/d;Le/b/a/w/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/b/a/w/c;-><init>(Le/b/a/w/f;Le/b/a/w/d;)V

    return-void
.end method

.method public static synthetic a(Le/b/a/w/c;)Le/b/a/w/d;
    .locals 0

    .line 1
    iget-object p0, p0, Le/b/a/w/c;->a:Le/b/a/w/d;

    return-object p0
.end method

.method public static synthetic b(Le/b/a/w/c;)[Z
    .locals 0

    .line 1
    iget-object p0, p0, Le/b/a/w/c;->b:[Z

    return-object p0
.end method


# virtual methods
.method public a(I)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/w/c;->d:Le/b/a/w/f;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Le/b/a/w/c;->a:Le/b/a/w/d;

    invoke-static {v1}, Le/b/a/w/d;->e(Le/b/a/w/d;)Le/b/a/w/c;

    move-result-object v1

    if-ne v1, p0, :cond_1

    .line 4
    iget-object v1, p0, Le/b/a/w/c;->a:Le/b/a/w/d;

    invoke-static {v1}, Le/b/a/w/d;->d(Le/b/a/w/d;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Le/b/a/w/c;->b:[Z

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    .line 6
    :cond_0
    iget-object v1, p0, Le/b/a/w/c;->a:Le/b/a/w/d;

    invoke-virtual {v1, p1}, Le/b/a/w/d;->b(I)Ljava/io/File;

    move-result-object p1

    .line 7
    iget-object v1, p0, Le/b/a/w/c;->d:Le/b/a/w/f;

    invoke-static {v1}, Le/b/a/w/f;->d(Le/b/a/w/f;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 8
    monitor-exit v0

    return-object p1

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    iget-object v0, p0, Le/b/a/w/c;->d:Le/b/a/w/f;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Le/b/a/w/f;->a(Le/b/a/w/f;Le/b/a/w/c;Z)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 2
    iget-boolean v0, p0, Le/b/a/w/c;->c:Z

    if-nez v0, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Le/b/a/w/c;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/w/c;->d:Le/b/a/w/f;

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Le/b/a/w/f;->a(Le/b/a/w/f;Le/b/a/w/c;Z)V

    .line 2
    iput-boolean v1, p0, Le/b/a/w/c;->c:Z

    return-void
.end method
