.class public Le/f/c/l/e/m/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/c/l/e/m/b1;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/b1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/a1;->a:Le/f/c/l/e/m/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Boolean;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/a1;->a:Le/f/c/l/e/m/b1;

    invoke-static {v0}, Le/f/c/l/e/m/b1;->b(Le/f/c/l/e/m/b1;)Le/f/c/l/e/m/v0;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/l/e/m/v0;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

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
    invoke-virtual {p0}, Le/f/c/l/e/m/a1;->call()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
