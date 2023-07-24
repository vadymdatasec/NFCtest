.class public final Le/f/a/d/a/b/v2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Le/f/a/d/a/e/a;


# instance fields
.field public final a:Le/f/a/d/a/b/b0;

.field public final b:Le/f/a/d/a/e/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/x<",
            "Le/f/a/d/a/b/j3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/f/a/d/a/b/v;

.field public final d:Le/f/a/d/a/e/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/x<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/f/a/d/a/e/a;

    const-string v1, "AssetPackManager"

    invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Le/f/a/d/a/b/v2;->e:Le/f/a/d/a/e/a;

    return-void
.end method

.method public constructor <init>(Le/f/a/d/a/b/b0;Le/f/a/d/a/e/x;Le/f/a/d/a/b/v;Le/f/a/d/a/h/a;Le/f/a/d/a/b/l1;Le/f/a/d/a/b/x0;Le/f/a/d/a/b/l0;Le/f/a/d/a/e/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/b/b0;",
            "Le/f/a/d/a/e/x<",
            "Le/f/a/d/a/b/j3;",
            ">;",
            "Le/f/a/d/a/b/v;",
            "Le/f/a/d/a/h/a;",
            "Le/f/a/d/a/b/l1;",
            "Le/f/a/d/a/b/x0;",
            "Le/f/a/d/a/b/l0;",
            "Le/f/a/d/a/e/x<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Le/f/a/d/a/b/v2;->a:Le/f/a/d/a/b/b0;

    iput-object p2, p0, Le/f/a/d/a/b/v2;->b:Le/f/a/d/a/e/x;

    iput-object p3, p0, Le/f/a/d/a/b/v2;->c:Le/f/a/d/a/b/v;

    iput-object p8, p0, Le/f/a/d/a/b/v2;->d:Le/f/a/d/a/e/x;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/Exception;)V
    .locals 3

    sget-object v0, Le/f/a/d/a/b/v2;->e:Le/f/a/d/a/e/a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Could not sync active asset packs. %s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Le/f/a/d/a/e/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/v2;->b:Le/f/a/d/a/e/x;

    invoke-interface {v0}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/b/j3;

    iget-object v1, p0, Le/f/a/d/a/b/v2;->a:Le/f/a/d/a/b/b0;

    invoke-virtual {v1}, Le/f/a/d/a/b/b0;->e()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Le/f/a/d/a/b/j3;->a(Ljava/util/Map;)Le/f/a/d/a/i/d;

    move-result-object v0

    iget-object v1, p0, Le/f/a/d/a/b/v2;->d:Le/f/a/d/a/e/x;

    invoke-interface {v1}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/d/a/b/v2;->a:Le/f/a/d/a/b/b0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Le/f/a/d/a/b/t2;->a(Le/f/a/d/a/b/b0;)Le/f/a/d/a/i/c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Le/f/a/d/a/i/d;->a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/c;)Le/f/a/d/a/i/d;

    iget-object v1, p0, Le/f/a/d/a/b/v2;->d:Le/f/a/d/a/e/x;

    invoke-interface {v1}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    sget-object v2, Le/f/a/d/a/b/u2;->a:Le/f/a/d/a/i/b;

    invoke-virtual {v0, v1, v2}, Le/f/a/d/a/i/d;->a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/b;)Le/f/a/d/a/i/d;

    return-void
.end method

.method public final a(Z)V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/v2;->c:Le/f/a/d/a/b/v;

    invoke-virtual {v0}, Le/f/a/d/a/f/c;->b()Z

    move-result v0

    iget-object v1, p0, Le/f/a/d/a/b/v2;->c:Le/f/a/d/a/b/v;

    invoke-virtual {v1, p1}, Le/f/a/d/a/f/c;->a(Z)V

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Le/f/a/d/a/b/v2;->b()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/v2;->d:Le/f/a/d/a/e/x;

    invoke-interface {v0}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    new-instance v1, Le/f/a/d/a/b/s2;

    invoke-direct {v1, p0}, Le/f/a/d/a/b/s2;-><init>(Le/f/a/d/a/b/v2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
