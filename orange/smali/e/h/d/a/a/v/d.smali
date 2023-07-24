.class public final Le/h/d/a/a/v/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Landroid/content/Context;

.field public final d:Ljava/lang/String;

.field public e:Ljava/util/Timer;

.field public f:Z

.field public g:Ljava/util/Date;

.field public h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/v/d;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/v/d;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/v/d;->c:Landroid/content/Context;

    .line 5
    const-class p1, Le/h/d/a/a/v/d;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/v/d;->d:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a(Le/h/d/a/a/v/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/v/d;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic a(Le/h/d/a/a/v/d;Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Le/h/d/a/a/v/d;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Le/h/d/a/a/v/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Landroid/content/Context;)V
    .locals 3

    .line 10
    iget-object v0, p0, Le/h/d/a/a/v/d;->d:Ljava/lang/String;

    invoke-virtual {p0}, Le/h/d/a/a/v/d;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "forcing update for zone "

    invoke-static {v2, v1}, Li/h/c/k;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    new-instance v0, Le/h/d/a/a/r/a;

    invoke-direct {v0, p1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Le/h/d/a/a/v/d;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Le/h/d/a/a/v/d;->a()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Le/h/d/a/a/v/d;->f:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Le/h/d/a/a/r/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public final a(Z)V
    .locals 5

    .line 4
    iput-boolean p1, p0, Le/h/d/a/a/v/d;->h:Z

    .line 5
    iget-object v0, p0, Le/h/d/a/a/v/d;->g:Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Le/h/d/a/a/v/d;->g:Ljava/util/Date;

    invoke-static {v2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    cmpl-double v4, v0, v2

    if-ltz v4, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Le/h/d/a/a/v/d;->b(Z)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Le/h/d/a/a/v/d;->d:Ljava/lang/String;

    const-string v0, "no update needed 1 second timeout is in effect"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0, p1}, Le/h/d/a/a/v/d;->b(Z)V

    :goto_0
    return-void
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/d;->c:Landroid/content/Context;

    return-object v0
.end method

.method public final b(Z)V
    .locals 4

    .line 2
    iget-boolean v0, p0, Le/h/d/a/a/v/d;->f:Z

    if-eq p1, v0, :cond_0

    .line 3
    iget-object v0, p0, Le/h/d/a/a/v/d;->c:Landroid/content/Context;

    .line 4
    new-instance v1, Le/h/d/a/a/r/a;

    invoke-direct {v1, v0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Le/h/d/a/a/v/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Le/h/d/a/a/v/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Le/h/d/a/a/r/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/v/d;->d:Ljava/lang/String;

    const-string v1, "no Change In state detected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    :goto_0
    iput-boolean p1, p0, Le/h/d/a/a/v/d;->f:Z

    .line 7
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/v/d;->g:Ljava/util/Date;

    .line 8
    invoke-virtual {p0}, Le/h/d/a/a/v/d;->e()V

    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/h/d/a/a/v/d;->h:Z

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/h/d/a/a/v/d;->g()V

    .line 2
    invoke-virtual {p0}, Le/h/d/a/a/v/d;->f()V

    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/v/d;->e:Ljava/util/Timer;

    .line 2
    new-instance v1, Le/h/d/a/a/v/c;

    invoke-direct {v1, p0}, Le/h/d/a/a/v/c;-><init>(Le/h/d/a/a/v/d;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/d;->e:Ljava/util/Timer;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :goto_0
    return-void
.end method
