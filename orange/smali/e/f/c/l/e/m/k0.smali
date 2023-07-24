.class public Le/f/c/l/e/m/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/b/h/f<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/a/b/h/g;

.field public final synthetic b:F

.field public final synthetic c:Le/f/c/l/e/m/v0;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;Le/f/a/b/h/g;F)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    iput-object p2, p0, Le/f/c/l/e/m/k0;->a:Le/f/a/b/h/g;

    iput p3, p0, Le/f/c/l/e/m/k0;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
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
    iget-object v0, p0, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v0}, Le/f/c/l/e/m/v0;->c(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/o;

    move-result-object v0

    new-instance v1, Le/f/c/l/e/m/j0;

    invoke-direct {v1, p0, p1}, Le/f/c/l/e/m/j0;-><init>(Le/f/c/l/e/m/k0;Ljava/lang/Boolean;)V

    invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->c(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Le/f/c/l/e/m/k0;->a(Ljava/lang/Boolean;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
