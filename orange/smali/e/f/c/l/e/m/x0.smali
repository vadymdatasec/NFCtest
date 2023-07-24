.class public Le/f/c/l/e/m/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Le/f/a/b/h/g<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/c/l/e/v/f;

.field public final synthetic b:Le/f/c/l/e/m/b1;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/b1;Le/f/c/l/e/v/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/x0;->b:Le/f/c/l/e/m/b1;

    iput-object p2, p0, Le/f/c/l/e/m/x0;->a:Le/f/c/l/e/v/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/x0;->b:Le/f/c/l/e/m/b1;

    iget-object v1, p0, Le/f/c/l/e/m/x0;->a:Le/f/c/l/e/v/f;

    invoke-static {v0, v1}, Le/f/c/l/e/m/b1;->a(Le/f/c/l/e/m/b1;Le/f/c/l/e/v/f;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/x0;->call()Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method
