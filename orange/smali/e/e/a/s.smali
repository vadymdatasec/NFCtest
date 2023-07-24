.class public final Le/e/a/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/e/a/a0;


# instance fields
.field public final synthetic a:Le/e/a/t;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Le/e/a/t;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/e/a/s;->a:Le/e/a/t;

    iput p2, p0, Le/e/a/s;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/e/a/s;->a:Le/e/a/t;

    iget v1, p0, Le/e/a/s;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Le/e/a/t;->a(Le/e/a/t;I)V

    return-void
.end method
