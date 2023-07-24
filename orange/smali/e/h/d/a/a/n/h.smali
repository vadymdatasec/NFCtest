.class public abstract Le/h/d/a/a/n/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/h/d/a/a/n/g;

.field public static b:Le/a/a/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/h/d/a/a/n/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/n/g;-><init>(Li/h/c/g;)V

    sput-object v0, Le/h/d/a/a/n/h;->a:Le/h/d/a/a/n/g;

    return-void
.end method

.method public static final synthetic a()Le/a/a/s;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/n/h;->b:Le/a/a/s;

    return-object v0
.end method

.method public static final declared-synchronized a(Landroid/content/Context;)Le/a/a/s;
    .locals 2

    const-class v0, Le/h/d/a/a/n/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, Le/h/d/a/a/n/h;->a:Le/h/d/a/a/n/g;

    invoke-virtual {v1, p0}, Le/h/d/a/a/n/g;->a(Landroid/content/Context;)Le/a/a/s;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final synthetic a(Le/a/a/s;)V
    .locals 0

    .line 2
    sput-object p0, Le/h/d/a/a/n/h;->b:Le/a/a/s;

    return-void
.end method
