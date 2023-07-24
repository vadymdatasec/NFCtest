.class public final synthetic Le/f/a/d/a/b/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/b/k1;


# instance fields
.field public final a:Le/f/a/d/a/b/l1;

.field public final b:I


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/l1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/e1;->a:Le/f/a/d/a/b/l1;

    iput p2, p0, Le/f/a/d/a/b/e1;->b:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/e1;->a:Le/f/a/d/a/b/l1;

    iget v1, p0, Le/f/a/d/a/b/e1;->b:I

    invoke-virtual {v0, v1}, Le/f/a/d/a/b/l1;->b(I)V

    const/4 v0, 0x0

    return-object v0
.end method
