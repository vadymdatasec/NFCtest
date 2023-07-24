.class public Le/f/c/l/e/v/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/v/f;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/f/c/l/e/v/j/g;

.field public final c:Le/f/c/l/e/v/g;

.field public final d:Le/f/c/l/e/m/h1;

.field public final e:Le/f/c/l/e/v/a;

.field public final f:Le/f/c/l/e/v/k/d;

.field public final g:Le/f/c/l/e/m/i1;

.field public final h:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Le/f/c/l/e/v/j/e;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Le/f/a/b/h/h<",
            "Le/f/c/l/e/v/j/b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/f/c/l/e/v/j/g;Le/f/c/l/e/m/h1;Le/f/c/l/e/v/g;Le/f/c/l/e/v/a;Le/f/c/l/e/v/k/d;Le/f/c/l/e/m/i1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Le/f/c/l/e/v/e;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Le/f/a/b/h/h;

    invoke-direct {v1}, Le/f/a/b/h/h;-><init>()V

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Le/f/c/l/e/v/e;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    iput-object p1, p0, Le/f/c/l/e/v/e;->a:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Le/f/c/l/e/v/e;->b:Le/f/c/l/e/v/j/g;

    .line 6
    iput-object p3, p0, Le/f/c/l/e/v/e;->d:Le/f/c/l/e/m/h1;

    .line 7
    iput-object p4, p0, Le/f/c/l/e/v/e;->c:Le/f/c/l/e/v/g;

    .line 8
    iput-object p5, p0, Le/f/c/l/e/v/e;->e:Le/f/c/l/e/v/a;

    .line 9
    iput-object p6, p0, Le/f/c/l/e/v/e;->f:Le/f/c/l/e/v/k/d;

    .line 10
    iput-object p7, p0, Le/f/c/l/e/v/e;->g:Le/f/c/l/e/m/i1;

    .line 11
    iget-object p1, p0, Le/f/c/l/e/v/e;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p3}, Le/f/c/l/e/v/b;->a(Le/f/c/l/e/m/h1;)Le/f/c/l/e/v/j/e;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Le/f/c/l/e/m/q1;Le/f/c/l/e/q/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/i1;)Le/f/c/l/e/v/e;
    .locals 16

    .line 4
    invoke-virtual/range {p2 .. p2}, Le/f/c/l/e/m/q1;->c()Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v10, Le/f/c/l/e/m/a2;

    invoke-direct {v10}, Le/f/c/l/e/m/a2;-><init>()V

    .line 6
    new-instance v11, Le/f/c/l/e/v/g;

    invoke-direct {v11, v10}, Le/f/c/l/e/v/g;-><init>(Le/f/c/l/e/m/h1;)V

    .line 7
    new-instance v12, Le/f/c/l/e/v/a;

    move-object/from16 v13, p0

    invoke-direct {v12, v13}, Le/f/c/l/e/v/a;-><init>(Landroid/content/Context;)V

    .line 8
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string v5, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"

    invoke-static {v1, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 9
    new-instance v14, Le/f/c/l/e/v/k/c;

    move-object/from16 v3, p3

    move-object/from16 v5, p6

    invoke-direct {v14, v5, v1, v3}, Le/f/c/l/e/v/k/c;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;)V

    .line 10
    invoke-virtual/range {p2 .. p2}, Le/f/c/l/e/m/q1;->d()Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-virtual/range {p2 .. p2}, Le/f/c/l/e/m/q1;->e()Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-virtual/range {p2 .. p2}, Le/f/c/l/e/m/q1;->f()Ljava/lang/String;

    move-result-object v6

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    .line 13
    invoke-static/range {p0 .. p0}, Le/f/c/l/e/m/j;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v1, v4

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p5, v1, v2

    const/4 v2, 0x3

    aput-object p4, v1, v2

    .line 14
    invoke-static {v1}, Le/f/c/l/e/m/j;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 15
    invoke-static {v0}, Le/f/c/l/e/m/k1;->a(Ljava/lang/String;)Le/f/c/l/e/m/k1;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/l/e/m/k1;->a()I

    move-result v9

    .line 16
    new-instance v15, Le/f/c/l/e/v/j/g;

    move-object v0, v15

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v5

    move-object v4, v6

    move-object/from16 v5, p2

    move-object v6, v7

    move-object/from16 v7, p5

    move-object/from16 v8, p4

    invoke-direct/range {v0 .. v9}, Le/f/c/l/e/v/j/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/r1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    new-instance v0, Le/f/c/l/e/v/e;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object v3, v15

    move-object v4, v10

    move-object v5, v11

    move-object v6, v12

    move-object v7, v14

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Le/f/c/l/e/v/e;-><init>(Landroid/content/Context;Le/f/c/l/e/v/j/g;Le/f/c/l/e/m/h1;Le/f/c/l/e/v/g;Le/f/c/l/e/v/a;Le/f/c/l/e/v/k/d;Le/f/c/l/e/m/i1;)V

    return-object v0
.end method

.method public static synthetic a(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/j/g;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/v/e;->b:Le/f/c/l/e/v/j/g;

    return-object p0
.end method

.method public static synthetic a(Le/f/c/l/e/v/e;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/v/e;->a(Lorg/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/v/e;Ljava/lang/String;)Z
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Le/f/c/l/e/v/e;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/k/d;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/v/e;->f:Le/f/c/l/e/v/k/d;

    return-object p0
.end method

.method public static synthetic c(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/g;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/v/e;->c:Le/f/c/l/e/v/g;

    return-object p0
.end method

.method public static synthetic d(Le/f/c/l/e/v/e;)Le/f/c/l/e/v/a;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/v/e;->e:Le/f/c/l/e/v/a;

    return-object p0
.end method

.method public static synthetic e(Le/f/c/l/e/v/e;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/v/e;->h:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static synthetic f(Le/f/c/l/e/v/e;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/v/e;->i:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public a()Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Le/f/c/l/e/v/j/b;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Le/f/c/l/e/v/e;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/h/h;

    invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public a(Le/f/c/l/e/v/c;Ljava/util/concurrent/Executor;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/v/c;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 20
    invoke-virtual {p0}, Le/f/c/l/e/v/e;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 21
    invoke-virtual {p0, p1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;)Le/f/c/l/e/v/j/f;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 22
    iget-object p2, p0, Le/f/c/l/e/v/e;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 23
    iget-object p2, p0, Le/f/c/l/e/v/e;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/f/a/b/h/h;

    invoke-virtual {p1}, Le/f/c/l/e/v/j/f;->c()Le/f/c/l/e/v/j/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 24
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 25
    :cond_0
    sget-object p1, Le/f/c/l/e/v/c;->d:Le/f/c/l/e/v/c;

    .line 26
    invoke-virtual {p0, p1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;)Le/f/c/l/e/v/j/f;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 27
    iget-object v0, p0, Le/f/c/l/e/v/e;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 28
    iget-object v0, p0, Le/f/c/l/e/v/e;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/h/h;

    invoke-virtual {p1}, Le/f/c/l/e/v/j/f;->c()Le/f/c/l/e/v/j/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    .line 29
    :cond_1
    iget-object p1, p0, Le/f/c/l/e/v/e;->g:Le/f/c/l/e/m/i1;

    .line 30
    invoke-virtual {p1}, Le/f/c/l/e/m/i1;->d()Le/f/a/b/h/g;

    move-result-object p1

    new-instance v0, Le/f/c/l/e/v/d;

    invoke-direct {v0, p0}, Le/f/c/l/e/v/d;-><init>(Le/f/c/l/e/v/e;)V

    .line 31
    invoke-virtual {p1, p2, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/util/concurrent/Executor;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 19
    sget-object v0, Le/f/c/l/e/v/c;->b:Le/f/c/l/e/v/c;

    invoke-virtual {p0, v0, p1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;Ljava/util/concurrent/Executor;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/f/c/l/e/v/c;)Le/f/c/l/e/v/j/f;
    .locals 5

    const/4 v0, 0x0

    .line 32
    :try_start_0
    sget-object v1, Le/f/c/l/e/v/c;->c:Le/f/c/l/e/v/c;

    invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 33
    iget-object v1, p0, Le/f/c/l/e/v/e;->e:Le/f/c/l/e/v/a;

    invoke-virtual {v1}, Le/f/c/l/e/v/a;->b()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 34
    iget-object v2, p0, Le/f/c/l/e/v/e;->c:Le/f/c/l/e/v/g;

    invoke-virtual {v2, v1}, Le/f/c/l/e/v/g;->a(Lorg/json/JSONObject;)Le/f/c/l/e/v/j/f;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "Loaded cached settings: "

    .line 35
    invoke-virtual {p0, v1, v3}, Le/f/c/l/e/v/e;->a(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 36
    iget-object v1, p0, Le/f/c/l/e/v/e;->d:Le/f/c/l/e/m/h1;

    invoke-interface {v1}, Le/f/c/l/e/m/h1;->a()J

    move-result-wide v3

    .line 37
    sget-object v1, Le/f/c/l/e/v/c;->d:Le/f/c/l/e/v/c;

    invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 38
    invoke-virtual {v2, v3, v4}, Le/f/c/l/e/v/j/f;->a(J)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v1, "Cached settings have expired."

    invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 40
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v0, "Returning cached settings."

    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v2

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v0, v2

    goto :goto_1

    .line 41
    :cond_2
    :try_start_2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v1, "Failed to parse cached settings data."

    invoke-virtual {p1, v1, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 42
    :cond_3
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v1, "No cached settings data found."

    invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 43
    :goto_1
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    const-string v2, "Failed to get cached settings"

    invoke-virtual {v1, v2, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-object v0
.end method

.method public final a(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 44
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Le/f/c/l/e/v/e;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/j;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 46
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    .line 47
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 48
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 p1, 0x1

    return p1
.end method

.method public b()Le/f/c/l/e/v/j/e;
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/c/l/e/v/e;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/c/l/e/v/j/e;

    return-object v0
.end method

.method public c()Z
    .locals 2

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/v/e;->d()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Le/f/c/l/e/v/e;->b:Le/f/c/l/e/v/j/g;

    iget-object v1, v1, Le/f/c/l/e/v/j/g;->f:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    .line 2
    iget-object v0, p0, Le/f/c/l/e/v/e;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/j;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    const-string v2, ""

    .line 3
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
