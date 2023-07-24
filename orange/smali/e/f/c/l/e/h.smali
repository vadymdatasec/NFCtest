.class public Le/f/c/l/e/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/b/h/f<",
        "Ljava/lang/Void;",
        "Le/f/c/l/e/v/j/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/c/l/e/v/e;


# direct methods
.method public constructor <init>(Le/f/c/l/e/j;Le/f/c/l/e/v/e;)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/f/c/l/e/h;->a:Le/f/c/l/e/v/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Le/f/c/l/e/h;->a(Ljava/lang/Void;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Void;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Le/f/a/b/h/g<",
            "Le/f/c/l/e/v/j/b;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object p1, p0, Le/f/c/l/e/h;->a:Le/f/c/l/e/v/e;

    invoke-virtual {p1}, Le/f/c/l/e/v/e;->a()Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
