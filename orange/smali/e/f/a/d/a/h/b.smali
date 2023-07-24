.class public final Le/f/a/d/a/h/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Le/f/a/d/a/h/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/h/b;->a:Le/f/a/d/a/e/a0;

    return-void
.end method

.method public static a(Le/f/a/d/a/e/a0;)Le/f/a/d/a/h/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;)",
            "Le/f/a/d/a/h/b;"
        }
    .end annotation

    new-instance v0, Le/f/a/d/a/h/b;

    invoke-direct {v0, p0}, Le/f/a/d/a/h/b;-><init>(Le/f/a/d/a/e/a0;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/h/b;->a:Le/f/a/d/a/e/a0;

    invoke-interface {v0}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Le/f/a/d/a/h/a;

    invoke-direct {v1, v0}, Le/f/a/d/a/h/a;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
