.class public Le/f/c/l/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/c/l/e/j;

.field public final synthetic b:Ljava/util/concurrent/ExecutorService;

.field public final synthetic c:Le/f/c/l/e/v/e;

.field public final synthetic d:Z

.field public final synthetic e:Le/f/c/l/e/m/b1;


# direct methods
.method public constructor <init>(Le/f/c/l/e/j;Ljava/util/concurrent/ExecutorService;Le/f/c/l/e/v/e;ZLe/f/c/l/e/m/b1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/c;->a:Le/f/c/l/e/j;

    iput-object p2, p0, Le/f/c/l/c;->b:Ljava/util/concurrent/ExecutorService;

    iput-object p3, p0, Le/f/c/l/c;->c:Le/f/c/l/e/v/e;

    iput-boolean p4, p0, Le/f/c/l/c;->d:Z

    iput-object p5, p0, Le/f/c/l/c;->e:Le/f/c/l/e/m/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/c/l/c;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/l/c;->a:Le/f/c/l/e/j;

    iget-object v1, p0, Le/f/c/l/c;->b:Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Le/f/c/l/c;->c:Le/f/c/l/e/v/e;

    invoke-virtual {v0, v1, v2}, Le/f/c/l/e/j;->a(Ljava/util/concurrent/Executor;Le/f/c/l/e/v/e;)V

    .line 3
    iget-boolean v0, p0, Le/f/c/l/c;->d:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Le/f/c/l/c;->e:Le/f/c/l/e/m/b1;

    iget-object v1, p0, Le/f/c/l/c;->c:Le/f/c/l/e/v/e;

    invoke-virtual {v0, v1}, Le/f/c/l/e/m/b1;->b(Le/f/c/l/e/v/f;)Le/f/a/b/h/g;

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
