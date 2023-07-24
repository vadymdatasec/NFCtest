.class public final synthetic Le/f/a/d/a/b/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/b/k1;


# instance fields
.field public final a:Le/f/a/d/a/b/l1;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/l1;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/b1;->a:Le/f/a/d/a/b/l1;

    iput-object p2, p0, Le/f/a/d/a/b/b1;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/b1;->a:Le/f/a/d/a/b/l1;

    iget-object v1, p0, Le/f/a/d/a/b/b1;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Le/f/a/d/a/b/l1;->c(Landroid/os/Bundle;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
