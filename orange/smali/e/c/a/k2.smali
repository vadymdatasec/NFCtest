.class public Le/c/a/k2;
.super Le/c/a/j2;
.source "SourceFile"


# instance fields
.field public a:F

.field public final synthetic b:Le/c/a/l2;


# direct methods
.method public constructor <init>(Le/c/a/l2;)V
    .locals 1

    .line 1
    iput-object p1, p0, Le/c/a/k2;->b:Le/c/a/l2;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le/c/a/j2;-><init>(Le/c/a/l2;Le/c/a/j2;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Le/c/a/k2;->a:F

    return-void
.end method

.method public synthetic constructor <init>(Le/c/a/l2;Le/c/a/k2;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Le/c/a/k2;-><init>(Le/c/a/l2;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Le/c/a/k2;->a:F

    iget-object v1, p0, Le/c/a/k2;->b:Le/c/a/l2;

    invoke-static {v1}, Le/c/a/l2;->b(Le/c/a/l2;)Le/c/a/h2;

    move-result-object v1

    iget-object v1, v1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr v0, p1

    iput v0, p0, Le/c/a/k2;->a:F

    return-void
.end method
