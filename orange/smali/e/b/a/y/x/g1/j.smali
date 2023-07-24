.class public Le/b/a/y/x/g1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/g1/c;


# instance fields
.field public final a:Le/b/a/y/x/g1/v;

.field public final b:Ljava/io/File;

.field public final c:J

.field public final d:Le/b/a/y/x/g1/g;

.field public e:Le/b/a/w/f;


# direct methods
.method public constructor <init>(Ljava/io/File;J)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/x/g1/g;

    invoke-direct {v0}, Le/b/a/y/x/g1/g;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/g1/j;->d:Le/b/a/y/x/g1/g;

    .line 3
    iput-object p1, p0, Le/b/a/y/x/g1/j;->b:Ljava/io/File;

    .line 4
    iput-wide p2, p0, Le/b/a/y/x/g1/j;->c:J

    .line 5
    new-instance p1, Le/b/a/y/x/g1/v;

    invoke-direct {p1}, Le/b/a/y/x/g1/v;-><init>()V

    iput-object p1, p0, Le/b/a/y/x/g1/j;->a:Le/b/a/y/x/g1/v;

    return-void
.end method

.method public static a(Ljava/io/File;J)Le/b/a/y/x/g1/c;
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/x/g1/j;

    invoke-direct {v0, p0, p1, p2}, Le/b/a/y/x/g1/j;-><init>(Ljava/io/File;J)V

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a()Le/b/a/w/f;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/g1/j;->e:Le/b/a/w/f;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/b/a/y/x/g1/j;->b:Ljava/io/File;

    iget-wide v1, p0, Le/b/a/y/x/g1/j;->c:J

    const/4 v3, 0x1

    invoke-static {v0, v3, v3, v1, v2}, Le/b/a/w/f;->a(Ljava/io/File;IIJ)Le/b/a/w/f;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/g1/j;->e:Le/b/a/w/f;

    .line 4
    :cond_0
    iget-object v0, p0, Le/b/a/y/x/g1/j;->e:Le/b/a/w/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Le/b/a/y/n;)Ljava/io/File;
    .locals 4

    .line 5
    iget-object v0, p0, Le/b/a/y/x/g1/j;->a:Le/b/a/y/x/g1/v;

    invoke-virtual {v0, p1}, Le/b/a/y/x/g1/v;->b(Le/b/a/y/n;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DiskLruCacheWrapper"

    const/4 v2, 0x2

    .line 6
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Get: Obtained: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " for for Key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Le/b/a/y/x/g1/j;->a()Le/b/a/w/f;

    move-result-object v2

    invoke-virtual {v2, v0}, Le/b/a/w/f;->c(Ljava/lang/String;)Le/b/a/w/e;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v2}, Le/b/a/w/e;->a(I)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v2, 0x5

    .line 10
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Unable to get from disk cache"

    .line 11
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    return-object p1
.end method

.method public a(Le/b/a/y/n;Le/b/a/y/x/g1/b;)V
    .locals 4

    const-string v0, "DiskLruCacheWrapper"

    .line 12
    iget-object v1, p0, Le/b/a/y/x/g1/j;->a:Le/b/a/y/x/g1/v;

    invoke-virtual {v1, p1}, Le/b/a/y/x/g1/v;->b(Le/b/a/y/n;)Ljava/lang/String;

    move-result-object v1

    .line 13
    iget-object v2, p0, Le/b/a/y/x/g1/j;->d:Le/b/a/y/x/g1/g;

    invoke-virtual {v2, v1}, Le/b/a/y/x/g1/g;->a(Ljava/lang/String;)V

    const/4 v2, 0x2

    .line 14
    :try_start_0
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Put: Obtained: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " for for Key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Le/b/a/y/x/g1/j;->a()Le/b/a/w/f;

    move-result-object p1

    .line 17
    invoke-virtual {p1, v1}, Le/b/a/w/f;->c(Ljava/lang/String;)Le/b/a/w/e;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_1

    .line 18
    iget-object p1, p0, Le/b/a/y/x/g1/j;->d:Le/b/a/y/x/g1/g;

    invoke-virtual {p1, v1}, Le/b/a/y/x/g1/g;->b(Ljava/lang/String;)V

    return-void

    .line 19
    :cond_1
    :try_start_2
    invoke-virtual {p1, v1}, Le/b/a/w/f;->b(Ljava/lang/String;)Le/b/a/w/c;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p1, :cond_3

    const/4 v2, 0x0

    .line 20
    :try_start_3
    invoke-virtual {p1, v2}, Le/b/a/w/c;->a(I)Ljava/io/File;

    move-result-object v2

    .line 21
    invoke-interface {p2, v2}, Le/b/a/y/x/g1/b;->a(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 22
    invoke-virtual {p1}, Le/b/a/w/c;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    :cond_2
    :try_start_4
    invoke-virtual {p1}, Le/b/a/w/c;->b()V

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Le/b/a/w/c;->b()V

    .line 24
    throw p2

    .line 25
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Had two simultaneous puts for: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catch_0
    move-exception p1

    const/4 p2, 0x5

    .line 26
    :try_start_5
    invoke-static {v0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "Unable to put to disk cache"

    .line 27
    invoke-static {v0, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 28
    :cond_4
    :goto_0
    iget-object p1, p0, Le/b/a/y/x/g1/j;->d:Le/b/a/y/x/g1/g;

    invoke-virtual {p1, v1}, Le/b/a/y/x/g1/g;->b(Ljava/lang/String;)V

    return-void

    :catchall_1
    move-exception p1

    iget-object p2, p0, Le/b/a/y/x/g1/j;->d:Le/b/a/y/x/g1/g;

    invoke-virtual {p2, v1}, Le/b/a/y/x/g1/g;->b(Ljava/lang/String;)V

    .line 29
    throw p1
.end method
