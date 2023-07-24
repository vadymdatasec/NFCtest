.class public abstract synthetic Le/f/a/d/a/a/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Le/f/a/d/a/a/v;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)Le/f/a/d/a/a/v;
    .locals 3

    const-class v0, Le/f/a/d/a/a/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Le/f/a/d/a/a/t;->a:Le/f/a/d/a/a/v;

    if-nez v1, :cond_0

    new-instance v1, Le/f/a/d/a/a/u;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Le/f/a/d/a/a/u;-><init>([B)V

    new-instance v2, Le/f/a/d/a/a/h;

    invoke-static {p0}, Le/f/a/d/a/g/a;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {v2, p0}, Le/f/a/d/a/a/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/a/u;->a(Le/f/a/d/a/a/h;)V

    invoke-virtual {v1}, Le/f/a/d/a/a/u;->a()Le/f/a/d/a/a/v;

    move-result-object p0

    sput-object p0, Le/f/a/d/a/a/t;->a:Le/f/a/d/a/a/v;

    :cond_0
    sget-object p0, Le/f/a/d/a/a/t;->a:Le/f/a/d/a/a/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
