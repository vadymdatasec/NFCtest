.class public Le/f/c/u/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/q/c0;


# instance fields
.field public final synthetic a:Le/f/c/u/i;


# direct methods
.method public constructor <init>(Le/f/c/u/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/u/h;->a:Le/f/c/u/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/u/h;->a:Le/f/c/u/i;

    invoke-static {v0, p1}, Le/f/c/u/i;->a(Le/f/c/u/i;Landroid/content/Intent;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
