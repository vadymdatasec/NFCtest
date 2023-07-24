.class public Le/d/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/util/Printer;


# instance fields
.field public a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Le/d/a/a/a;->a:I

    return-void
.end method

.method public static synthetic a(Le/d/a/a/a;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/d/a/a/a;->a()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 2
    iget v0, p0, Le/d/a/a/a;->a:I

    return v0
.end method

.method public println(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Le/d/a/a/a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "networkSecurityConfigRes=0x"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x1b

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x10

    invoke-static {p1, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Le/d/a/a/a;->a:I

    :cond_0
    return-void
.end method
