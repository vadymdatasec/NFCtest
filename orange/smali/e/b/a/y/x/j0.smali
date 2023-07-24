.class public Le/b/a/y/x/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/o0;
.implements Le/b/a/y/x/g1/n;
.implements Le/b/a/y/x/r0;


# static fields
.field public static final i:Z


# instance fields
.field public final a:Le/b/a/y/x/u0;

.field public final b:Le/b/a/y/x/q0;

.field public final c:Le/b/a/y/x/g1/o;

.field public final d:Le/b/a/y/x/g0;

.field public final e:Le/b/a/y/x/c1;

.field public final f:Le/b/a/y/x/h0;

.field public final g:Le/b/a/y/x/e0;

.field public final h:Le/b/a/y/x/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "Engine"

    const/4 v1, 0x2

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Le/b/a/y/x/j0;->i:Z

    return-void
.end method

.method public constructor <init>(Le/b/a/y/x/g1/o;Le/b/a/y/x/g1/a;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/u0;Le/b/a/y/x/q0;Le/b/a/y/x/f;Le/b/a/y/x/g0;Le/b/a/y/x/e0;Le/b/a/y/x/c1;Z)V
    .locals 10

    move-object v7, p0

    move-object v8, p1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object v8, v7, Le/b/a/y/x/j0;->c:Le/b/a/y/x/g1/o;

    .line 4
    new-instance v0, Le/b/a/y/x/h0;

    move-object v1, p2

    invoke-direct {v0, p2}, Le/b/a/y/x/h0;-><init>(Le/b/a/y/x/g1/a;)V

    iput-object v0, v7, Le/b/a/y/x/j0;->f:Le/b/a/y/x/h0;

    if-nez p9, :cond_0

    .line 5
    new-instance v0, Le/b/a/y/x/f;

    move/from16 v1, p13

    invoke-direct {v0, v1}, Le/b/a/y/x/f;-><init>(Z)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p9

    .line 6
    :goto_0
    iput-object v0, v7, Le/b/a/y/x/j0;->h:Le/b/a/y/x/f;

    .line 7
    invoke-virtual {v0, p0}, Le/b/a/y/x/f;->a(Le/b/a/y/x/r0;)V

    if-nez p8, :cond_1

    .line 8
    new-instance v0, Le/b/a/y/x/q0;

    invoke-direct {v0}, Le/b/a/y/x/q0;-><init>()V

    goto :goto_1

    :cond_1
    move-object/from16 v0, p8

    .line 9
    :goto_1
    iput-object v0, v7, Le/b/a/y/x/j0;->b:Le/b/a/y/x/q0;

    if-nez p7, :cond_2

    .line 10
    new-instance v0, Le/b/a/y/x/u0;

    invoke-direct {v0}, Le/b/a/y/x/u0;-><init>()V

    goto :goto_2

    :cond_2
    move-object/from16 v0, p7

    .line 11
    :goto_2
    iput-object v0, v7, Le/b/a/y/x/j0;->a:Le/b/a/y/x/u0;

    if-nez p10, :cond_3

    .line 12
    new-instance v9, Le/b/a/y/x/g0;

    move-object v0, v9

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object/from16 v4, p6

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Le/b/a/y/x/g0;-><init>(Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/o0;Le/b/a/y/x/r0;)V

    goto :goto_3

    :cond_3
    move-object/from16 v9, p10

    .line 13
    :goto_3
    iput-object v9, v7, Le/b/a/y/x/j0;->d:Le/b/a/y/x/g0;

    if-nez p11, :cond_4

    .line 14
    new-instance v0, Le/b/a/y/x/e0;

    iget-object v1, v7, Le/b/a/y/x/j0;->f:Le/b/a/y/x/h0;

    invoke-direct {v0, v1}, Le/b/a/y/x/e0;-><init>(Le/b/a/y/x/r;)V

    goto :goto_4

    :cond_4
    move-object/from16 v0, p11

    .line 15
    :goto_4
    iput-object v0, v7, Le/b/a/y/x/j0;->g:Le/b/a/y/x/e0;

    if-nez p12, :cond_5

    .line 16
    new-instance v0, Le/b/a/y/x/c1;

    invoke-direct {v0}, Le/b/a/y/x/c1;-><init>()V

    goto :goto_5

    :cond_5
    move-object/from16 v0, p12

    .line 17
    :goto_5
    iput-object v0, v7, Le/b/a/y/x/j0;->e:Le/b/a/y/x/c1;

    .line 18
    invoke-interface {p1, p0}, Le/b/a/y/x/g1/o;->a(Le/b/a/y/x/g1/n;)V

    return-void
.end method

.method public constructor <init>(Le/b/a/y/x/g1/o;Le/b/a/y/x/g1/a;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Z)V
    .locals 14

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v13, p7

    .line 1
    invoke-direct/range {v0 .. v13}, Le/b/a/y/x/j0;-><init>(Le/b/a/y/x/g1/o;Le/b/a/y/x/g1/a;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/u0;Le/b/a/y/x/q0;Le/b/a/y/x/f;Le/b/a/y/x/g0;Le/b/a/y/x/e0;Le/b/a/y/x/c1;Z)V

    return-void
.end method

.method public static a(Ljava/lang/String;JLe/b/a/y/n;)V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Le/b/a/e0/m;->a(J)D

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, "ms, key: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Engine"

    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/n;IILjava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/x/c0;Ljava/util/Map;ZZLe/b/a/y/r;ZZZZLe/b/a/c0/k;Ljava/util/concurrent/Executor;)Le/b/a/y/x/i0;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/j;",
            "Ljava/lang/Object;",
            "Le/b/a/y/n;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Le/b/a/n;",
            "Le/b/a/y/x/c0;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;ZZ",
            "Le/b/a/y/r;",
            "ZZZZ",
            "Le/b/a/c0/k;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/b/a/y/x/i0;"
        }
    .end annotation

    move-object/from16 v15, p0

    .line 1
    sget-boolean v0, Le/b/a/y/x/j0;->i:Z

    if-eqz v0, :cond_0

    invoke-static {}, Le/b/a/e0/m;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    move-wide v13, v0

    .line 2
    iget-object v0, v15, Le/b/a/y/x/j0;->b:Le/b/a/y/x/q0;

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p10

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p13

    .line 3
    invoke-virtual/range {v0 .. v8}, Le/b/a/y/x/q0;->a(Ljava/lang/Object;Le/b/a/y/n;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/r;)Le/b/a/y/x/p0;

    move-result-object v0

    .line 4
    monitor-enter p0

    move/from16 v12, p14

    .line 5
    :try_start_0
    invoke-virtual {v15, v0, v12, v13, v14}, Le/b/a/y/x/j0;->a(Le/b/a/y/x/p0;ZJ)Le/b/a/y/x/s0;

    move-result-object v1

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-wide/from16 v22, v13

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, v0

    .line 6
    invoke-virtual/range {v1 .. v23}, Le/b/a/y/x/j0;->a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/n;IILjava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/x/c0;Ljava/util/Map;ZZLe/b/a/y/r;ZZZZLe/b/a/c0/k;Ljava/util/concurrent/Executor;Le/b/a/y/x/p0;J)Le/b/a/y/x/i0;

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 7
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    sget-object v0, Le/b/a/y/a;->f:Le/b/a/y/a;

    const/4 v2, 0x0

    move-object/from16 v3, p18

    invoke-interface {v3, v1, v0, v2}, Le/b/a/c0/k;->a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    .line 9
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/n;IILjava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/x/c0;Ljava/util/Map;ZZLe/b/a/y/r;ZZZZLe/b/a/c0/k;Ljava/util/concurrent/Executor;Le/b/a/y/x/p0;J)Le/b/a/y/x/i0;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/j;",
            "Ljava/lang/Object;",
            "Le/b/a/y/n;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Le/b/a/n;",
            "Le/b/a/y/x/c0;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;ZZ",
            "Le/b/a/y/r;",
            "ZZZZ",
            "Le/b/a/c0/k;",
            "Ljava/util/concurrent/Executor;",
            "Le/b/a/y/x/p0;",
            "J)",
            "Le/b/a/y/x/i0;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    move-object/from16 v15, p20

    move-wide/from16 v13, p21

    .line 10
    iget-object v3, v0, Le/b/a/y/x/j0;->a:Le/b/a/y/x/u0;

    move/from16 v12, p17

    invoke-virtual {v3, v15, v12}, Le/b/a/y/x/u0;->a(Le/b/a/y/n;Z)Le/b/a/y/x/k0;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 11
    invoke-virtual {v3, v1, v2}, Le/b/a/y/x/k0;->a(Le/b/a/c0/k;Ljava/util/concurrent/Executor;)V

    .line 12
    sget-boolean v2, Le/b/a/y/x/j0;->i:Z

    if-eqz v2, :cond_0

    const-string v2, "Added to existing load"

    .line 13
    invoke-static {v2, v13, v14, v15}, Le/b/a/y/x/j0;->a(Ljava/lang/String;JLe/b/a/y/n;)V

    .line 14
    :cond_0
    new-instance v2, Le/b/a/y/x/i0;

    invoke-direct {v2, v0, v1, v3}, Le/b/a/y/x/i0;-><init>(Le/b/a/y/x/j0;Le/b/a/c0/k;Le/b/a/y/x/k0;)V

    return-object v2

    .line 15
    :cond_1
    iget-object v3, v0, Le/b/a/y/x/j0;->d:Le/b/a/y/x/g0;

    move-object/from16 v4, p20

    move/from16 v5, p14

    move/from16 v6, p15

    move/from16 v7, p16

    move/from16 v8, p17

    .line 16
    invoke-virtual/range {v3 .. v8}, Le/b/a/y/x/g0;->a(Le/b/a/y/n;ZZZZ)Le/b/a/y/x/k0;

    move-result-object v11

    move-object/from16 v19, v11

    .line 17
    iget-object v3, v0, Le/b/a/y/x/j0;->g:Le/b/a/y/x/e0;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p20

    move-object/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    move-object v1, v11

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move-object v2, v15

    move/from16 v15, p11

    move/from16 v16, p12

    move/from16 v17, p17

    move-object/from16 v18, p13

    .line 18
    invoke-virtual/range {v3 .. v19}, Le/b/a/y/x/e0;->a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/x/p0;Le/b/a/y/n;IILjava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/x/c0;Ljava/util/Map;ZZZLe/b/a/y/r;Le/b/a/y/x/o;)Le/b/a/y/x/p;

    move-result-object v3

    .line 19
    iget-object v4, v0, Le/b/a/y/x/j0;->a:Le/b/a/y/x/u0;

    invoke-virtual {v4, v2, v1}, Le/b/a/y/x/u0;->a(Le/b/a/y/n;Le/b/a/y/x/k0;)V

    move-object v5, v1

    move-object v4, v2

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    .line 20
    invoke-virtual {v5, v1, v2}, Le/b/a/y/x/k0;->a(Le/b/a/c0/k;Ljava/util/concurrent/Executor;)V

    .line 21
    invoke-virtual {v5, v3}, Le/b/a/y/x/k0;->b(Le/b/a/y/x/p;)V

    .line 22
    sget-boolean v2, Le/b/a/y/x/j0;->i:Z

    if-eqz v2, :cond_2

    const-string v2, "Started new load"

    move-wide/from16 v6, p21

    .line 23
    invoke-static {v2, v6, v7, v4}, Le/b/a/y/x/j0;->a(Ljava/lang/String;JLe/b/a/y/n;)V

    .line 24
    :cond_2
    new-instance v2, Le/b/a/y/x/i0;

    invoke-direct {v2, v0, v1, v5}, Le/b/a/y/x/i0;-><init>(Le/b/a/y/x/j0;Le/b/a/c0/k;Le/b/a/y/x/k0;)V

    return-object v2
.end method

.method public final a(Le/b/a/y/n;)Le/b/a/y/x/s0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            ")",
            "Le/b/a/y/x/s0<",
            "*>;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Le/b/a/y/x/j0;->c:Le/b/a/y/x/g1/o;

    invoke-interface {v0, p1}, Le/b/a/y/x/g1/o;->a(Le/b/a/y/n;)Le/b/a/y/x/y0;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 33
    :cond_0
    instance-of v0, v2, Le/b/a/y/x/s0;

    if-eqz v0, :cond_1

    .line 34
    move-object p1, v2

    check-cast p1, Le/b/a/y/x/s0;

    goto :goto_0

    .line 35
    :cond_1
    new-instance v0, Le/b/a/y/x/s0;

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v1, v0

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Le/b/a/y/x/s0;-><init>(Le/b/a/y/x/y0;ZZLe/b/a/y/n;Le/b/a/y/x/r0;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final a(Le/b/a/y/x/p0;ZJ)Le/b/a/y/x/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/p0;",
            "ZJ)",
            "Le/b/a/y/x/s0<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 25
    :cond_0
    invoke-virtual {p0, p1}, Le/b/a/y/x/j0;->b(Le/b/a/y/n;)Le/b/a/y/x/s0;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 26
    sget-boolean v0, Le/b/a/y/x/j0;->i:Z

    if-eqz v0, :cond_1

    const-string v0, "Loaded resource from active resources"

    .line 27
    invoke-static {v0, p3, p4, p1}, Le/b/a/y/x/j0;->a(Ljava/lang/String;JLe/b/a/y/n;)V

    :cond_1
    return-object p2

    .line 28
    :cond_2
    invoke-virtual {p0, p1}, Le/b/a/y/x/j0;->c(Le/b/a/y/n;)Le/b/a/y/x/s0;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 29
    sget-boolean v0, Le/b/a/y/x/j0;->i:Z

    if-eqz v0, :cond_3

    const-string v0, "Loaded resource from cache"

    .line 30
    invoke-static {v0, p3, p4, p1}, Le/b/a/y/x/j0;->a(Ljava/lang/String;JLe/b/a/y/n;)V

    :cond_3
    return-object p2

    :cond_4
    return-object v0
.end method

.method public a(Le/b/a/y/n;Le/b/a/y/x/s0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/s0<",
            "*>;)V"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Le/b/a/y/x/j0;->h:Le/b/a/y/x/f;

    invoke-virtual {v0, p1}, Le/b/a/y/x/f;->a(Le/b/a/y/n;)V

    .line 44
    invoke-virtual {p2}, Le/b/a/y/x/s0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Le/b/a/y/x/j0;->c:Le/b/a/y/x/g1/o;

    invoke-interface {v0, p1, p2}, Le/b/a/y/x/g1/o;->a(Le/b/a/y/n;Le/b/a/y/x/y0;)Le/b/a/y/x/y0;

    goto :goto_0

    .line 46
    :cond_0
    iget-object p1, p0, Le/b/a/y/x/j0;->e:Le/b/a/y/x/c1;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Le/b/a/y/x/c1;->a(Le/b/a/y/x/y0;Z)V

    :goto_0
    return-void
.end method

.method public declared-synchronized a(Le/b/a/y/x/k0;Le/b/a/y/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/k0<",
            "*>;",
            "Le/b/a/y/n;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    .line 40
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/j0;->a:Le/b/a/y/x/u0;

    invoke-virtual {v0, p2, p1}, Le/b/a/y/x/u0;->b(Le/b/a/y/n;Le/b/a/y/x/k0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Le/b/a/y/x/k0;Le/b/a/y/n;Le/b/a/y/x/s0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/k0<",
            "*>;",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/s0<",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    if-eqz p3, :cond_0

    .line 36
    :try_start_0
    invoke-virtual {p3}, Le/b/a/y/x/s0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Le/b/a/y/x/j0;->h:Le/b/a/y/x/f;

    invoke-virtual {v0, p2, p3}, Le/b/a/y/x/f;->a(Le/b/a/y/n;Le/b/a/y/x/s0;)V

    .line 38
    :cond_0
    iget-object p3, p0, Le/b/a/y/x/j0;->a:Le/b/a/y/x/u0;

    invoke-virtual {p3, p2, p1}, Le/b/a/y/x/u0;->b(Le/b/a/y/n;Le/b/a/y/x/k0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Le/b/a/y/x/y0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "*>;)V"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Le/b/a/y/x/j0;->e:Le/b/a/y/x/c1;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Le/b/a/y/x/c1;->a(Le/b/a/y/x/y0;Z)V

    return-void
.end method

.method public final b(Le/b/a/y/n;)Le/b/a/y/x/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            ")",
            "Le/b/a/y/x/s0<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/j0;->h:Le/b/a/y/x/f;

    invoke-virtual {v0, p1}, Le/b/a/y/x/f;->b(Le/b/a/y/n;)Le/b/a/y/x/s0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Le/b/a/y/x/s0;->a()V

    :cond_0
    return-object p1
.end method

.method public b(Le/b/a/y/x/y0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "*>;)V"
        }
    .end annotation

    .line 3
    instance-of v0, p1, Le/b/a/y/x/s0;

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Le/b/a/y/x/s0;

    invoke-virtual {p1}, Le/b/a/y/x/s0;->g()V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot release anything but an EngineResource"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Le/b/a/y/n;)Le/b/a/y/x/s0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            ")",
            "Le/b/a/y/x/s0<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/y/x/j0;->a(Le/b/a/y/n;)Le/b/a/y/x/s0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/b/a/y/x/s0;->a()V

    .line 3
    iget-object v1, p0, Le/b/a/y/x/j0;->h:Le/b/a/y/x/f;

    invoke-virtual {v1, p1, v0}, Le/b/a/y/x/f;->a(Le/b/a/y/n;Le/b/a/y/x/s0;)V

    :cond_0
    return-object v0
.end method
