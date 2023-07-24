.class public Le/f/a/a/j/j0/j/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Le/f/a/a/j/j0/k/e;

.field public final c:Le/f/a/a/j/j0/j/y;

.field public final d:Le/f/a/a/j/k0/b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/j0/j/y;Le/f/a/a/j/k0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/j0/j/w;->a:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/j0/j/w;->b:Le/f/a/a/j/j0/k/e;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/j0/j/w;->c:Le/f/a/a/j/j0/j/y;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/j0/j/w;->d:Le/f/a/a/j/k0/b;

    return-void
.end method

.method public static synthetic a(Le/f/a/a/j/j0/j/w;)Ljava/lang/Object;
    .locals 4

    .line 2
    iget-object v0, p0, Le/f/a/a/j/j0/j/w;->b:Le/f/a/a/j/j0/k/e;

    invoke-interface {v0}, Le/f/a/a/j/j0/k/e;->k()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/a/j/x;

    .line 3
    iget-object v2, p0, Le/f/a/a/j/j0/j/w;->c:Le/f/a/a/j/j0/j/y;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Le/f/a/a/j/j0/j/y;->a(Le/f/a/a/j/x;I)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Le/f/a/a/j/j0/j/w;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/j/j0/j/w;->d:Le/f/a/a/j/k0/b;

    invoke-static {p0}, Le/f/a/a/j/j0/j/v;->a(Le/f/a/a/j/j0/j/w;)Le/f/a/a/j/k0/a;

    move-result-object p0

    invoke-interface {v0, p0}, Le/f/a/a/j/k0/b;->a(Le/f/a/a/j/k0/a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/a/j/j0/j/w;->a:Ljava/util/concurrent/Executor;

    invoke-static {p0}, Le/f/a/a/j/j0/j/u;->a(Le/f/a/a/j/j0/j/w;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
