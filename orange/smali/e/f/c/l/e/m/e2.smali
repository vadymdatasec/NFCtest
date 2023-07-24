.class public Le/f/c/l/e/m/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/b/h/a<",
        "TT;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/a/b/h/h;


# direct methods
.method public constructor <init>(Le/f/a/b/h/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/e2;->a:Le/f/a/b/h/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/c/l/e/m/e2;->a(Le/f/a/b/h/g;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/a/b/h/g;)Ljava/lang/Void;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/h/g<",
            "TT;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/a/b/h/g;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Le/f/c/l/e/m/e2;->a:Le/f/a/b/h/h;

    invoke-virtual {p1}, Le/f/a/b/h/g;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/m/e2;->a:Le/f/a/b/h/h;

    invoke-virtual {p1}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
