.class public Le/b/a/y/x/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/l;
.implements Le/b/a/y/x/k;


# instance fields
.field public final b:Le/b/a/y/x/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/m<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/x/k;

.field public volatile d:I

.field public volatile e:Le/b/a/y/x/h;

.field public volatile f:Ljava/lang/Object;

.field public volatile g:Le/b/a/y/y/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/v0<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile h:Le/b/a/y/x/i;


# direct methods
.method public constructor <init>(Le/b/a/y/x/m;Le/b/a/y/x/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/m<",
            "*>;",
            "Le/b/a/y/x/k;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    .line 3
    iput-object p2, p0, Le/b/a/y/x/e1;->c:Le/b/a/y/x/k;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/n;Ljava/lang/Exception;Le/b/a/y/w/e;Le/b/a/y/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Ljava/lang/Exception;",
            "Le/b/a/y/w/e<",
            "*>;",
            "Le/b/a/y/a;",
            ")V"
        }
    .end annotation

    .line 51
    iget-object p4, p0, Le/b/a/y/x/e1;->c:Le/b/a/y/x/k;

    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v0}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v0

    invoke-interface {p4, p1, p2, p3, v0}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Exception;Le/b/a/y/w/e;Le/b/a/y/a;)V

    return-void
.end method

.method public a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Ljava/lang/Object;",
            "Le/b/a/y/w/e<",
            "*>;",
            "Le/b/a/y/a;",
            "Le/b/a/y/n;",
            ")V"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Le/b/a/y/x/e1;->c:Le/b/a/y/x/k;

    iget-object p4, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object p4, p4, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {p4}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V

    return-void
.end method

.method public a(Le/b/a/y/y/v0;Ljava/lang/Exception;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/v0<",
            "*>;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Le/b/a/y/x/e1;->c:Le/b/a/y/x/k;

    iget-object v1, p0, Le/b/a/y/x/e1;->h:Le/b/a/y/x/i;

    iget-object p1, p1, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {p1}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v2

    invoke-interface {v0, v1, p2, p1, v2}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Exception;Le/b/a/y/w/e;Le/b/a/y/a;)V

    return-void
.end method

.method public a(Le/b/a/y/y/v0;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/v0<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v0}, Le/b/a/y/x/m;->e()Le/b/a/y/x/c0;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 43
    iget-object v1, p1, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v1}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/b/a/y/x/c0;->a(Le/b/a/y/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iput-object p2, p0, Le/b/a/y/x/e1;->f:Ljava/lang/Object;

    .line 45
    iget-object p1, p0, Le/b/a/y/x/e1;->c:Le/b/a/y/x/k;

    invoke-interface {p1}, Le/b/a/y/x/k;->b()V

    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Le/b/a/y/x/e1;->c:Le/b/a/y/x/k;

    iget-object v1, p1, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    iget-object v3, p1, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    .line 47
    invoke-interface {v3}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v4

    iget-object v5, p0, Le/b/a/y/x/e1;->h:Le/b/a/y/x/i;

    move-object v2, p2

    .line 48
    invoke-interface/range {v0 .. v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V

    :goto_0
    return-void
.end method

.method public a()Z
    .locals 5

    .line 1
    iget-object v0, p0, Le/b/a/y/x/e1;->f:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/y/x/e1;->f:Ljava/lang/Object;

    .line 3
    iput-object v1, p0, Le/b/a/y/x/e1;->f:Ljava/lang/Object;

    .line 4
    :try_start_0
    invoke-virtual {p0, v0}, Le/b/a/y/x/e1;->a(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    return v2

    :catch_0
    move-exception v0

    const/4 v3, 0x3

    const-string v4, "SourceGenerator"

    .line 5
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Failed to properly rewind or write data to cache"

    .line 6
    invoke-static {v4, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 7
    :cond_0
    iget-object v0, p0, Le/b/a/y/x/e1;->e:Le/b/a/y/x/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/b/a/y/x/e1;->e:Le/b/a/y/x/h;

    invoke-virtual {v0}, Le/b/a/y/x/h;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 8
    :cond_1
    iput-object v1, p0, Le/b/a/y/x/e1;->e:Le/b/a/y/x/h;

    .line 9
    iput-object v1, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-nez v0, :cond_4

    .line 10
    invoke-virtual {p0}, Le/b/a/y/x/e1;->c()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    iget-object v1, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v1}, Le/b/a/y/x/m;->g()Ljava/util/List;

    move-result-object v1

    iget v3, p0, Le/b/a/y/x/e1;->d:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Le/b/a/y/x/e1;->d:I

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/y/y/v0;

    iput-object v1, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    .line 12
    iget-object v1, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    if-eqz v1, :cond_2

    iget-object v1, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    .line 13
    invoke-virtual {v1}, Le/b/a/y/x/m;->e()Le/b/a/y/x/c0;

    move-result-object v1

    iget-object v3, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v3, v3, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v3}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Le/b/a/y/x/c0;->a(Le/b/a/y/a;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    iget-object v3, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v3, v3, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    .line 14
    invoke-interface {v3}, Le/b/a/y/w/e;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Le/b/a/y/x/m;->c(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 15
    :cond_3
    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    invoke-virtual {p0, v0}, Le/b/a/y/x/e1;->b(Le/b/a/y/y/v0;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public a(Le/b/a/y/y/v0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/v0<",
            "*>;)Z"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    if-eqz v0, :cond_0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "SourceGenerator"

    .line 17
    invoke-static {}, Le/b/a/e0/m;->a()J

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 18
    :try_start_0
    iget-object v5, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v5, p1}, Le/b/a/y/x/m;->a(Ljava/lang/Object;)Le/b/a/y/w/g;

    move-result-object v5

    .line 19
    invoke-interface {v5}, Le/b/a/y/w/g;->a()Ljava/lang/Object;

    move-result-object v6

    .line 20
    iget-object v7, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v7, v6}, Le/b/a/y/x/m;->b(Ljava/lang/Object;)Le/b/a/y/d;

    move-result-object v7

    .line 21
    new-instance v8, Le/b/a/y/x/j;

    iget-object v9, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v9}, Le/b/a/y/x/m;->i()Le/b/a/y/r;

    move-result-object v9

    invoke-direct {v8, v7, v6, v9}, Le/b/a/y/x/j;-><init>(Le/b/a/y/d;Ljava/lang/Object;Le/b/a/y/r;)V

    .line 22
    new-instance v6, Le/b/a/y/x/i;

    iget-object v9, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v9, v9, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    iget-object v10, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v10}, Le/b/a/y/x/m;->l()Le/b/a/y/n;

    move-result-object v10

    invoke-direct {v6, v9, v10}, Le/b/a/y/x/i;-><init>(Le/b/a/y/n;Le/b/a/y/n;)V

    .line 23
    iget-object v9, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v9}, Le/b/a/y/x/m;->d()Le/b/a/y/x/g1/c;

    move-result-object v9

    .line 24
    invoke-interface {v9, v6, v8}, Le/b/a/y/x/g1/c;->a(Le/b/a/y/n;Le/b/a/y/x/g1/b;)V

    const/4 v8, 0x2

    .line 25
    invoke-static {v0, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v10, ", data: "

    if-eqz v8, :cond_0

    .line 26
    :try_start_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Finished encoding source to cache, key: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", encoder: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", duration: "

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-static {v1, v2}, Le/b/a/e0/m;->a(J)D

    move-result-wide v1

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    :cond_0
    invoke-interface {v9, v6}, Le/b/a/y/x/g1/c;->a(Le/b/a/y/n;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 30
    iput-object v6, p0, Le/b/a/y/x/e1;->h:Le/b/a/y/x/i;

    .line 31
    new-instance p1, Le/b/a/y/x/h;

    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v0, v0, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    .line 32
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-direct {p1, v0, v1, p0}, Le/b/a/y/x/h;-><init>(Ljava/util/List;Le/b/a/y/x/m;Le/b/a/y/x/k;)V

    iput-object p1, p0, Le/b/a/y/x/e1;->e:Le/b/a/y/x/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    iget-object p1, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object p1, p1, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {p1}, Le/b/a/y/w/e;->b()V

    return v3

    :cond_1
    const/4 v1, 0x3

    .line 34
    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempt to write: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/b/a/y/x/e1;->h:Le/b/a/y/x/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    :cond_2
    :try_start_3
    iget-object p1, p0, Le/b/a/y/x/e1;->c:Le/b/a/y/x/k;

    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v6, v0, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    .line 37
    invoke-interface {v5}, Le/b/a/y/w/g;->a()Ljava/lang/Object;

    move-result-object v7

    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v8, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    .line 38
    invoke-interface {v0}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v9

    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v10, v0, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    move-object v5, p1

    .line 39
    invoke-interface/range {v5 .. v10}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return v4

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_3

    .line 40
    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v0}, Le/b/a/y/w/e;->b()V

    .line 41
    :cond_3
    throw p1
.end method

.method public b()V
    .locals 1

    .line 4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final b(Le/b/a/y/y/v0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/v0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    iget-object v1, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    .line 2
    invoke-virtual {v1}, Le/b/a/y/x/m;->j()Le/b/a/n;

    move-result-object v1

    new-instance v2, Le/b/a/y/x/d1;

    invoke-direct {v2, p0, p1}, Le/b/a/y/x/d1;-><init>(Le/b/a/y/x/e1;Le/b/a/y/y/v0;)V

    .line 3
    invoke-interface {v0, v1, v2}, Le/b/a/y/w/e;->a(Le/b/a/n;Le/b/a/y/w/d;)V

    return-void
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget v0, p0, Le/b/a/y/x/e1;->d:I

    iget-object v1, p0, Le/b/a/y/x/e1;->b:Le/b/a/y/x/m;

    invoke-virtual {v1}, Le/b/a/y/x/m;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/e1;->g:Le/b/a/y/y/v0;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v0}, Le/b/a/y/w/e;->cancel()V

    :cond_0
    return-void
.end method
