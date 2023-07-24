.class public final Le/f/a/d/a/b/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Le/f/a/d/a/b/i0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/j3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/j3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/j0;->a:Le/f/a/d/a/e/a0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/j0;->a:Le/f/a/d/a/e/a0;

    invoke-static {v0}, Le/f/a/d/a/e/z;->b(Le/f/a/d/a/e/a0;)Le/f/a/d/a/e/x;

    move-result-object v0

    new-instance v1, Le/f/a/d/a/b/i0;

    invoke-direct {v1, v0}, Le/f/a/d/a/b/i0;-><init>(Le/f/a/d/a/e/x;)V

    return-object v1
.end method
