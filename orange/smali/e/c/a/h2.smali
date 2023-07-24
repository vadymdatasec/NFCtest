.class public Le/c/a/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public b:Le/c/a/y0;

.field public c:Z

.field public d:Z

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/Paint;

.field public g:Le/c/a/n;

.field public h:Le/c/a/n;

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Le/c/a/l2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    const/16 v0, 0x181

    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFlags(I)V

    .line 4
    iget-object p1, p0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    iget-object p1, p0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Le/c/a/h2;->f:Landroid/graphics/Paint;

    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFlags(I)V

    .line 8
    iget-object p1, p0, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 9
    iget-object p1, p0, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 10
    invoke-static {}, Le/c/a/y0;->a()Le/c/a/y0;

    move-result-object p1

    iput-object p1, p0, Le/c/a/h2;->b:Le/c/a/y0;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h2;

    .line 2
    iget-object v1, p0, Le/c/a/h2;->b:Le/c/a/y0;

    invoke-virtual {v1}, Le/c/a/y0;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/y0;

    iput-object v1, v0, Le/c/a/h2;->b:Le/c/a/y0;

    .line 3
    new-instance v1, Landroid/graphics/Paint;

    iget-object v2, p0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, v0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    .line 4
    new-instance v1, Landroid/graphics/Paint;

    iget-object v2, p0, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, v0, Le/c/a/h2;->f:Landroid/graphics/Paint;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 5
    new-instance v1, Ljava/lang/InternalError;

    invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v1
.end method
