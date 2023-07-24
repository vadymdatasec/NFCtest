.class public Le/b/a/y/x/g1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/b/a/e0/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/o<",
            "Le/b/a/y/n;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Le/b/a/y/x/g1/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/e0/o;

    const-wide/16 v1, 0x3e8

    invoke-direct {v0, v1, v2}, Le/b/a/e0/o;-><init>(J)V

    iput-object v0, p0, Le/b/a/y/x/g1/v;->a:Le/b/a/e0/o;

    .line 3
    new-instance v0, Le/b/a/y/x/g1/t;

    invoke-direct {v0, p0}, Le/b/a/y/x/g1/t;-><init>(Le/b/a/y/x/g1/v;)V

    const/16 v1, 0xa

    .line 4
    invoke-static {v1, v0}, Le/b/a/e0/u/h;->a(ILe/b/a/e0/u/d;)Lc/h/m/d;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/g1/v;->b:Lc/h/m/d;

    return-void
.end method


# virtual methods
.method public final a(Le/b/a/y/n;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/x/g1/v;->b:Lc/h/m/d;

    invoke-interface {v0}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Le/b/a/y/x/g1/u;

    .line 2
    :try_start_0
    iget-object v1, v0, Le/b/a/y/x/g1/u;->b:Ljava/security/MessageDigest;

    invoke-interface {p1, v1}, Le/b/a/y/n;->a(Ljava/security/MessageDigest;)V

    .line 3
    iget-object p1, v0, Le/b/a/y/x/g1/u;->b:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-static {p1}, Le/b/a/e0/t;->a([B)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    iget-object v1, p0, Le/b/a/y/x/g1/v;->b:Lc/h/m/d;

    invoke-interface {v1, v0}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v1, p0, Le/b/a/y/x/g1/v;->b:Lc/h/m/d;

    invoke-interface {v1, v0}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    .line 5
    throw p1
.end method

.method public b(Le/b/a/y/n;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/y/x/g1/v;->a:Le/b/a/e0/o;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/y/x/g1/v;->a:Le/b/a/e0/o;

    invoke-virtual {v1, p1}, Le/b/a/e0/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {p0, p1}, Le/b/a/y/x/g1/v;->a(Le/b/a/y/n;)Ljava/lang/String;

    move-result-object v1

    .line 5
    :cond_0
    iget-object v2, p0, Le/b/a/y/x/g1/v;->a:Le/b/a/e0/o;

    monitor-enter v2

    .line 6
    :try_start_1
    iget-object v0, p0, Le/b/a/y/x/g1/v;->a:Le/b/a/e0/o;

    invoke-virtual {v0, p1, v1}, Le/b/a/e0/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    monitor-exit v2

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 8
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
