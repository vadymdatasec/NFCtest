.class public Le/f/c/l/e/m/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Le/f/a/b/h/h;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;Le/f/a/b/h/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/g2;->b:Ljava/util/concurrent/Callable;

    iput-object p2, p0, Le/f/c/l/e/m/g2;->c:Le/f/a/b/h/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f/c/l/e/m/g2;->b:Ljava/util/concurrent/Callable;

    .line 2
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/h/g;

    new-instance v1, Le/f/c/l/e/m/f2;

    invoke-direct {v1, p0}, Le/f/c/l/e/m/f2;-><init>(Le/f/c/l/e/m/g2;)V

    .line 3
    invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/a;)Le/f/a/b/h/g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    iget-object v1, p0, Le/f/c/l/e/m/g2;->c:Le/f/a/b/h/h;

    invoke-virtual {v1, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
