.class public Le/f/c/l/e/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/c/l/e/q/c;

.field public final b:Le/f/c/h;

.field public final c:Landroid/content/Context;

.field public d:Landroid/content/pm/PackageManager;

.field public e:Ljava/lang/String;

.field public f:Landroid/content/pm/PackageInfo;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Le/f/c/l/e/m/q1;

.field public m:Le/f/c/l/e/m/i1;


# direct methods
.method public constructor <init>(Le/f/c/h;Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/i1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/f/c/l/e/q/c;

    invoke-direct {v0}, Le/f/c/l/e/q/c;-><init>()V

    iput-object v0, p0, Le/f/c/l/e/j;->a:Le/f/c/l/e/q/c;

    .line 3
    iput-object p1, p0, Le/f/c/l/e/j;->b:Le/f/c/h;

    .line 4
    iput-object p2, p0, Le/f/c/l/e/j;->c:Landroid/content/Context;

    .line 5
    iput-object p3, p0, Le/f/c/l/e/j;->l:Le/f/c/l/e/m/q1;

    .line 6
    iput-object p4, p0, Le/f/c/l/e/j;->m:Le/f/c/l/e/m/i1;

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/j;Le/f/c/l/e/v/j/b;Ljava/lang/String;Le/f/c/l/e/v/e;Ljava/util/concurrent/Executor;Z)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Le/f/c/l/e/j;->a(Le/f/c/l/e/v/j/b;Ljava/lang/String;Le/f/c/l/e/v/e;Ljava/util/concurrent/Executor;Z)V

    return-void
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Le/f/c/l/e/m/b1;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/c/l/e/j;->c:Landroid/content/Context;

    return-object v0
.end method

.method public a(Landroid/content/Context;Le/f/c/h;Ljava/util/concurrent/Executor;)Le/f/c/l/e/v/e;
    .locals 8

    .line 8
    invoke-virtual {p2}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object p2

    invoke-virtual {p2}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object v1

    .line 9
    iget-object v2, p0, Le/f/c/l/e/j;->l:Le/f/c/l/e/m/q1;

    iget-object v3, p0, Le/f/c/l/e/j;->a:Le/f/c/l/e/q/c;

    iget-object v4, p0, Le/f/c/l/e/j;->g:Ljava/lang/String;

    iget-object v5, p0, Le/f/c/l/e/j;->h:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Le/f/c/l/e/j;->c()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Le/f/c/l/e/j;->m:Le/f/c/l/e/m/i1;

    move-object v0, p1

    .line 11
    invoke-static/range {v0 .. v7}, Le/f/c/l/e/v/e;->a(Landroid/content/Context;Ljava/lang/String;Le/f/c/l/e/m/q1;Le/f/c/l/e/q/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/i1;)Le/f/c/l/e/v/e;

    move-result-object p1

    .line 12
    invoke-virtual {p1, p3}, Le/f/c/l/e/v/e;->a(Ljava/util/concurrent/Executor;)Le/f/a/b/h/g;

    move-result-object p2

    new-instance v0, Le/f/c/l/e/i;

    invoke-direct {v0, p0}, Le/f/c/l/e/i;-><init>(Le/f/c/l/e/j;)V

    .line 13
    invoke-virtual {p2, p3, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/v/j/a;
    .locals 14

    move-object v0, p0

    .line 27
    invoke-virtual {p0}, Le/f/c/l/e/j;->a()Landroid/content/Context;

    move-result-object v1

    .line 28
    invoke-static {v1}, Le/f/c/l/e/m/j;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p2, v2, v1

    .line 29
    iget-object v1, v0, Le/f/c/l/e/j;->h:Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v1, v2, v3

    iget-object v1, v0, Le/f/c/l/e/j;->g:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v1, v2, v3

    .line 30
    invoke-static {v2}, Le/f/c/l/e/m/j;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 31
    iget-object v1, v0, Le/f/c/l/e/j;->i:Ljava/lang/String;

    invoke-static {v1}, Le/f/c/l/e/m/k1;->a(Ljava/lang/String;)Le/f/c/l/e/m/k1;

    move-result-object v1

    invoke-virtual {v1}, Le/f/c/l/e/m/k1;->a()I

    move-result v11

    .line 32
    invoke-virtual {p0}, Le/f/c/l/e/j;->b()Le/f/c/l/e/m/q1;

    move-result-object v1

    invoke-virtual {v1}, Le/f/c/l/e/m/q1;->b()Ljava/lang/String;

    move-result-object v6

    .line 33
    new-instance v1, Le/f/c/l/e/v/j/a;

    iget-object v7, v0, Le/f/c/l/e/j;->h:Ljava/lang/String;

    iget-object v8, v0, Le/f/c/l/e/j;->g:Ljava/lang/String;

    iget-object v10, v0, Le/f/c/l/e/j;->j:Ljava/lang/String;

    iget-object v12, v0, Le/f/c/l/e/j;->k:Ljava/lang/String;

    const-string v13, "0"

    move-object v3, v1

    move-object v4, p1

    move-object/from16 v5, p2

    invoke-direct/range {v3 .. v13}, Le/f/c/l/e/v/j/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final a(Le/f/c/l/e/v/j/b;Ljava/lang/String;Le/f/c/l/e/v/e;Ljava/util/concurrent/Executor;Z)V
    .locals 2

    .line 14
    iget-object v0, p1, Le/f/c/l/e/v/j/b;->a:Ljava/lang/String;

    const-string v1, "new"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15
    invoke-virtual {p0, p1, p2, p5}, Le/f/c/l/e/j;->a(Le/f/c/l/e/v/j/b;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 16
    sget-object p1, Le/f/c/l/e/v/c;->c:Le/f/c/l/e/v/c;

    invoke-virtual {p3, p1, p4}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;Ljava/util/concurrent/Executor;)Le/f/a/b/h/g;

    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const/4 p2, 0x0

    const-string p3, "Failed to create app with Crashlytics service."

    invoke-virtual {p1, p3, p2}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p1, Le/f/c/l/e/v/j/b;->a:Ljava/lang/String;

    const-string v1, "configured"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19
    sget-object p1, Le/f/c/l/e/v/c;->c:Le/f/c/l/e/v/c;

    invoke-virtual {p3, p1, p4}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;Ljava/util/concurrent/Executor;)Le/f/a/b/h/g;

    goto :goto_0

    .line 20
    :cond_2
    iget-boolean p3, p1, Le/f/c/l/e/v/j/b;->f:Z

    if-eqz p3, :cond_3

    .line 21
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p3

    const-string p4, "Server says an update is required - forcing a full App update."

    invoke-virtual {p3, p4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0, p1, p2, p5}, Le/f/c/l/e/j;->b(Le/f/c/l/e/v/j/b;Ljava/lang/String;Z)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public a(Ljava/util/concurrent/Executor;Le/f/c/l/e/v/e;)V
    .locals 3

    .line 3
    iget-object v0, p0, Le/f/c/l/e/j;->b:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Le/f/c/l/e/j;->m:Le/f/c/l/e/m/i1;

    .line 5
    invoke-virtual {v1}, Le/f/c/l/e/m/i1;->d()Le/f/a/b/h/g;

    move-result-object v1

    new-instance v2, Le/f/c/l/e/h;

    invoke-direct {v2, p0, p2}, Le/f/c/l/e/h;-><init>(Le/f/c/l/e/j;Le/f/c/l/e/v/e;)V

    .line 6
    invoke-virtual {v1, p1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object v1

    new-instance v2, Le/f/c/l/e/g;

    invoke-direct {v2, p0, v0, p2, p1}, Le/f/c/l/e/g;-><init>(Le/f/c/l/e/j;Ljava/lang/String;Le/f/c/l/e/v/e;Ljava/util/concurrent/Executor;)V

    .line 7
    invoke-virtual {v1, p1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;

    return-void
.end method

.method public final a(Le/f/c/l/e/v/j/b;Ljava/lang/String;Z)Z
    .locals 4

    .line 23
    iget-object v0, p1, Le/f/c/l/e/v/j/b;->e:Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, Le/f/c/l/e/j;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/v/j/a;

    move-result-object p2

    .line 24
    new-instance v0, Le/f/c/l/e/v/k/b;

    .line 25
    invoke-virtual {p0}, Le/f/c/l/e/j;->c()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Le/f/c/l/e/v/j/b;->b:Ljava/lang/String;

    iget-object v2, p0, Le/f/c/l/e/j;->a:Le/f/c/l/e/q/c;

    invoke-static {}, Le/f/c/l/e/j;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, p1, v2, v3}, Le/f/c/l/e/v/k/b;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0, p2, p3}, Le/f/c/l/e/v/k/a;->a(Le/f/c/l/e/v/j/a;Z)Z

    move-result p1

    return p1
.end method

.method public final b()Le/f/c/l/e/m/q1;
    .locals 1

    .line 5
    iget-object v0, p0, Le/f/c/l/e/j;->l:Le/f/c/l/e/m/q1;

    return-object v0
.end method

.method public final b(Le/f/c/l/e/v/j/b;Ljava/lang/String;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, Le/f/c/l/e/v/j/b;->e:Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, Le/f/c/l/e/j;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/v/j/a;

    move-result-object p2

    .line 2
    new-instance v0, Le/f/c/l/e/v/k/e;

    .line 3
    invoke-virtual {p0}, Le/f/c/l/e/j;->c()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Le/f/c/l/e/v/j/b;->b:Ljava/lang/String;

    iget-object v2, p0, Le/f/c/l/e/j;->a:Le/f/c/l/e/q/c;

    invoke-static {}, Le/f/c/l/e/j;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, p1, v2, v3}, Le/f/c/l/e/v/k/e;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p2, p3}, Le/f/c/l/e/v/k/a;->a(Le/f/c/l/e/v/j/a;Z)Z

    move-result p1

    return p1
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/j;->c:Landroid/content/Context;

    const-string v1, "com.crashlytics.ApiEndpoint"

    invoke-static {v0, v1}, Le/f/c/l/e/m/j;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Le/f/c/l/e/j;->l:Le/f/c/l/e/m/q1;

    invoke-virtual {v1}, Le/f/c/l/e/m/q1;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/j;->i:Ljava/lang/String;

    .line 2
    iget-object v1, p0, Le/f/c/l/e/j;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/j;->d:Landroid/content/pm/PackageManager;

    .line 3
    iget-object v1, p0, Le/f/c/l/e/j;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/j;->e:Ljava/lang/String;

    .line 4
    iget-object v2, p0, Le/f/c/l/e/j;->d:Landroid/content/pm/PackageManager;

    invoke-virtual {v2, v1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/j;->f:Landroid/content/pm/PackageInfo;

    .line 5
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/j;->g:Ljava/lang/String;

    .line 6
    iget-object v1, p0, Le/f/c/l/e/j;->f:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0.0"

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Le/f/c/l/e/j;->f:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    :goto_0
    iput-object v1, p0, Le/f/c/l/e/j;->h:Ljava/lang/String;

    .line 8
    iget-object v1, p0, Le/f/c/l/e/j;->d:Landroid/content/pm/PackageManager;

    iget-object v2, p0, Le/f/c/l/e/j;->c:Landroid/content/Context;

    .line 9
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/j;->j:Ljava/lang/String;

    .line 10
    iget-object v1, p0, Le/f/c/l/e/j;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/j;->k:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    .line 11
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v2

    const-string v3, "Failed init"

    invoke-virtual {v2, v3, v1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method
