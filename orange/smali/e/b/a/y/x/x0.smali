.class public final Le/b/a/y/x/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/y0;
.implements Le/b/a/e0/u/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/x/y0<",
        "TZ;>;",
        "Le/b/a/e0/u/f;"
    }
.end annotation


# static fields
.field public static final f:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Le/b/a/y/x/x0<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Le/b/a/e0/u/l;

.field public c:Le/b/a/y/x/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/y0<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/b/a/y/x/w0;

    invoke-direct {v0}, Le/b/a/y/x/w0;-><init>()V

    const/16 v1, 0x14

    .line 2
    invoke-static {v1, v0}, Le/b/a/e0/u/h;->a(ILe/b/a/e0/u/d;)Lc/h/m/d;

    move-result-object v0

    sput-object v0, Le/b/a/y/x/x0;->f:Lc/h/m/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Le/b/a/e0/u/l;->b()Le/b/a/e0/u/l;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/x0;->b:Le/b/a/e0/u/l;

    return-void
.end method

.method public static b(Le/b/a/y/x/y0;)Le/b/a/y/x/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/x/y0<",
            "TZ;>;)",
            "Le/b/a/y/x/x0<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/x/x0;->f:Lc/h/m/d;

    invoke-interface {v0}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/x/x0;

    invoke-static {v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Le/b/a/y/x/x0;

    .line 2
    invoke-virtual {v0, p0}, Le/b/a/y/x/x0;->a(Le/b/a/y/x/y0;)V

    return-object v0
.end method


# virtual methods
.method public a()Le/b/a/e0/u/l;
    .locals 1

    .line 4
    iget-object v0, p0, Le/b/a/y/x/x0;->b:Le/b/a/e0/u/l;

    return-object v0
.end method

.method public final a(Le/b/a/y/x/y0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TZ;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Le/b/a/y/x/x0;->e:Z

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/b/a/y/x/x0;->d:Z

    .line 3
    iput-object p1, p0, Le/b/a/y/x/x0;->c:Le/b/a/y/x/y0;

    return-void
.end method

.method public b()I
    .locals 1

    .line 3
    iget-object v0, p0, Le/b/a/y/x/x0;->c:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->b()I

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/x0;->c:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->c()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized d()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/x0;->b:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/b/a/y/x/x0;->e:Z

    .line 3
    iget-boolean v0, p0, Le/b/a/y/x/x0;->d:Z

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/y/x/x0;->c:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->d()V

    .line 5
    invoke-virtual {p0}, Le/b/a/y/x/x0;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Le/b/a/y/x/x0;->c:Le/b/a/y/x/y0;

    .line 2
    sget-object v0, Le/b/a/y/x/x0;->f:Lc/h/m/d;

    invoke-interface {v0, p0}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public declared-synchronized f()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/x0;->b:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 2
    iget-boolean v0, p0, Le/b/a/y/x/x0;->d:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Le/b/a/y/x/x0;->d:Z

    .line 4
    iget-boolean v0, p0, Le/b/a/y/x/x0;->e:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Le/b/a/y/x/x0;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :cond_0
    monitor-exit p0

    return-void

    .line 7
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TZ;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/x0;->c:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
