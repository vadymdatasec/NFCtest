.class public abstract Le/f/c/q/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:Ljava/lang/Object;

.field public static c:Le/f/a/b/g/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Le/f/c/q/a0;->a:J

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le/f/c/q/a0;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 3

    .line 4
    sget-object v0, Le/f/c/q/a0;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    invoke-static {p0}, Le/f/c/q/a0;->a(Landroid/content/Context;)V

    .line 6
    invoke-static {p1}, Le/f/c/q/a0;->b(Landroid/content/Intent;)Z

    move-result v1

    const/4 v2, 0x1

    .line 7
    invoke-static {p1, v2}, Le/f/c/q/a0;->a(Landroid/content/Intent;Z)V

    .line 8
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 9
    monitor-exit v0

    return-object p0

    :cond_0
    if-nez v1, :cond_1

    .line 10
    sget-object p1, Le/f/c/q/a0;->c:Le/f/a/b/g/a;

    sget-wide v1, Le/f/c/q/a0;->a:J

    invoke-virtual {p1, v1, v2}, Le/f/a/b/g/a;->a(J)V

    .line 11
    :cond_1
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget-object v0, Le/f/c/q/a0;->c:Le/f/a/b/g/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Le/f/a/b/g/a;

    const/4 v1, 0x1

    const-string v2, "wake:com.google.firebase.iid.WakeLockHolder"

    invoke-direct {v0, p0, v1, v2}, Le/f/a/b/g/a;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    .line 3
    sput-object v0, Le/f/c/q/a0;->c:Le/f/a/b/g/a;

    invoke-virtual {v0, v1}, Le/f/a/b/g/a;->a(Z)V

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Intent;)V
    .locals 2

    .line 14
    sget-object v0, Le/f/c/q/a0;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 15
    :try_start_0
    sget-object v1, Le/f/c/q/a0;->c:Le/f/a/b/g/a;

    if-eqz v1, :cond_0

    invoke-static {p0}, Le/f/c/q/a0;->b(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v1}, Le/f/c/q/a0;->a(Landroid/content/Intent;Z)V

    .line 17
    sget-object p0, Le/f/c/q/a0;->c:Le/f/a/b/g/a;

    invoke-virtual {p0}, Le/f/a/b/g/a;->a()V

    .line 18
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Intent;Z)V
    .locals 1

    const-string v0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 13
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-void
.end method

.method public static b(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method
