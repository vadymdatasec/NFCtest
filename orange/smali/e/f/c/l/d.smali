.class public Le/f/c/l/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Le/f/c/j/a/c;Le/f/c/l/a;)Le/f/c/j/a/a;
    .locals 2

    const-string v0, "clx"

    .line 30
    invoke-interface {p0, v0, p1}, Le/f/c/j/a/c;->a(Ljava/lang/String;Le/f/c/j/a/b;)Le/f/c/j/a/a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 31
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    .line 32
    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    const-string v0, "crash"

    .line 33
    invoke-interface {p0, v0, p1}, Le/f/c/j/a/c;->a(Ljava/lang/String;Le/f/c/j/a/b;)Le/f/c/j/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 34
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p0

    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    .line 35
    invoke-virtual {p0, p1}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public static a(Le/f/c/h;Le/f/c/s/k;Le/f/c/l/e/a;Le/f/c/j/a/c;)Le/f/c/l/d;
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v0, p3

    .line 1
    invoke-virtual/range {p0 .. p0}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v9

    .line 2
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, Le/f/c/l/e/m/q1;

    move-object/from16 v3, p1

    invoke-direct {v2, v9, v1, v3}, Le/f/c/l/e/m/q1;-><init>(Landroid/content/Context;Ljava/lang/String;Le/f/c/s/k;)V

    .line 4
    new-instance v4, Le/f/c/l/e/m/i1;

    invoke-direct {v4, v8}, Le/f/c/l/e/m/i1;-><init>(Le/f/c/h;)V

    if-nez p2, :cond_0

    .line 5
    new-instance v1, Le/f/c/l/e/e;

    invoke-direct {v1}, Le/f/c/l/e/e;-><init>()V

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    .line 6
    :goto_0
    new-instance v11, Le/f/c/l/e/j;

    invoke-direct {v11, v8, v9, v2, v4}, Le/f/c/l/e/j;-><init>(Le/f/c/h;Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/i1;)V

    if-eqz v0, :cond_2

    .line 7
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    const-string v5, "Firebase Analytics is available."

    invoke-virtual {v1, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 8
    new-instance v1, Le/f/c/l/e/k/e;

    invoke-direct {v1, v0}, Le/f/c/l/e/k/e;-><init>(Le/f/c/j/a/c;)V

    .line 9
    new-instance v5, Le/f/c/l/a;

    invoke-direct {v5}, Le/f/c/l/a;-><init>()V

    .line 10
    invoke-static {v0, v5}, Le/f/c/l/d;->a(Le/f/c/j/a/c;Le/f/c/l/a;)Le/f/c/j/a/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v6, "Firebase Analytics listener registered successfully."

    invoke-virtual {v0, v6}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 12
    new-instance v0, Le/f/c/l/e/k/d;

    invoke-direct {v0}, Le/f/c/l/e/k/d;-><init>()V

    .line 13
    new-instance v6, Le/f/c/l/e/k/c;

    const/16 v7, 0x1f4

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v6, v1, v7, v10}, Le/f/c/l/e/k/c;-><init>(Le/f/c/l/e/k/e;ILjava/util/concurrent/TimeUnit;)V

    .line 14
    invoke-virtual {v5, v0}, Le/f/c/l/a;->a(Le/f/c/l/e/k/b;)V

    .line 15
    invoke-virtual {v5, v6}, Le/f/c/l/a;->b(Le/f/c/l/e/k/b;)V

    move-object v1, v6

    goto :goto_1

    .line 16
    :cond_1
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v5, "Firebase Analytics listener registration failed."

    invoke-virtual {v0, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 17
    new-instance v0, Le/f/c/l/e/l/c;

    invoke-direct {v0}, Le/f/c/l/e/l/c;-><init>()V

    goto :goto_1

    .line 18
    :cond_2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Firebase Analytics is unavailable."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 19
    new-instance v0, Le/f/c/l/e/l/c;

    invoke-direct {v0}, Le/f/c/l/e/l/c;-><init>()V

    .line 20
    new-instance v1, Le/f/c/l/e/k/f;

    invoke-direct {v1}, Le/f/c/l/e/k/f;-><init>()V

    :goto_1
    move-object v5, v0

    move-object v6, v1

    const-string v0, "Crashlytics Exception Handler"

    .line 21
    invoke-static {v0}, Le/f/c/l/e/m/o1;->a(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    .line 22
    new-instance v15, Le/f/c/l/e/m/b1;

    move-object v0, v15

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v7}, Le/f/c/l/e/m/b1;-><init>(Le/f/c/h;Le/f/c/l/e/m/q1;Le/f/c/l/e/a;Le/f/c/l/e/m/i1;Le/f/c/l/e/l/b;Le/f/c/l/e/k/a;Ljava/util/concurrent/ExecutorService;)V

    .line 23
    invoke-virtual {v11}, Le/f/c/l/e/j;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 24
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Unable to start Crashlytics."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_3
    const-string v0, "com.google.firebase.crashlytics.startup"

    .line 25
    invoke-static {v0}, Le/f/c/l/e/m/o1;->a(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 26
    invoke-virtual {v11, v9, v8, v0}, Le/f/c/l/e/j;->a(Landroid/content/Context;Le/f/c/h;Ljava/util/concurrent/Executor;)Le/f/c/l/e/v/e;

    move-result-object v13

    .line 27
    invoke-virtual {v15, v13}, Le/f/c/l/e/m/b1;->d(Le/f/c/l/e/v/f;)Z

    move-result v14

    .line 28
    new-instance v1, Le/f/c/l/c;

    move-object v10, v1

    move-object v12, v0

    move-object v2, v15

    invoke-direct/range {v10 .. v15}, Le/f/c/l/c;-><init>(Le/f/c/l/e/j;Ljava/util/concurrent/ExecutorService;Le/f/c/l/e/v/e;ZLe/f/c/l/e/m/b1;)V

    invoke-static {v0, v1}, Le/f/a/b/h/n;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    .line 29
    new-instance v0, Le/f/c/l/d;

    invoke-direct {v0, v2}, Le/f/c/l/d;-><init>(Le/f/c/l/e/m/b1;)V

    return-object v0
.end method
