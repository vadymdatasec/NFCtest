.class public final enum Lc/l/d/g3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/l/d/g3;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/l/d/g3;

.field public static final enum c:Lc/l/d/g3;

.field public static final enum d:Lc/l/d/g3;

.field public static final enum e:Lc/l/d/g3;

.field public static final synthetic f:[Lc/l/d/g3;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lc/l/d/g3;

    const/4 v1, 0x0

    const-string v2, "REMOVED"

    invoke-direct {v0, v2, v1}, Lc/l/d/g3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/l/d/g3;->b:Lc/l/d/g3;

    .line 2
    new-instance v0, Lc/l/d/g3;

    const/4 v2, 0x1

    const-string v3, "VISIBLE"

    invoke-direct {v0, v3, v2}, Lc/l/d/g3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/l/d/g3;->c:Lc/l/d/g3;

    .line 3
    new-instance v0, Lc/l/d/g3;

    const/4 v3, 0x2

    const-string v4, "GONE"

    invoke-direct {v0, v4, v3}, Lc/l/d/g3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/l/d/g3;->d:Lc/l/d/g3;

    .line 4
    new-instance v0, Lc/l/d/g3;

    const/4 v4, 0x3

    const-string v5, "INVISIBLE"

    invoke-direct {v0, v5, v4}, Lc/l/d/g3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/l/d/g3;->e:Lc/l/d/g3;

    const/4 v5, 0x4

    new-array v5, v5, [Lc/l/d/g3;

    .line 5
    sget-object v6, Lc/l/d/g3;->b:Lc/l/d/g3;

    aput-object v6, v5, v1

    sget-object v1, Lc/l/d/g3;->c:Lc/l/d/g3;

    aput-object v1, v5, v2

    sget-object v1, Lc/l/d/g3;->d:Lc/l/d/g3;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Lc/l/d/g3;->f:[Lc/l/d/g3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(I)Lc/l/d/g3;
    .locals 3

    if-eqz p0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/16 v0, 0x8

    if-ne p0, v0, :cond_0

    .line 1
    sget-object p0, Lc/l/d/g3;->d:Lc/l/d/g3;

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown visibility "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    sget-object p0, Lc/l/d/g3;->e:Lc/l/d/g3;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, Lc/l/d/g3;->c:Lc/l/d/g3;

    return-object p0
.end method

.method public static b(Landroid/view/View;)Lc/l/d/g3;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object p0, Lc/l/d/g3;->e:Lc/l/d/g3;

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    invoke-static {p0}, Lc/l/d/g3;->a(I)Lc/l/d/g3;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lc/l/d/g3;
    .locals 1

    .line 1
    const-class v0, Lc/l/d/g3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/l/d/g3;

    return-object p0
.end method

.method public static values()[Lc/l/d/g3;
    .locals 1

    .line 1
    sget-object v0, Lc/l/d/g3;->f:[Lc/l/d/g3;

    invoke-virtual {v0}, [Lc/l/d/g3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/l/d/g3;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 5

    .line 5
    sget-object v0, Lc/l/d/c3;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "FragmentManager"

    const/4 v3, 0x2

    if-eq v0, v1, :cond_6

    const-string v1, "SpecialEffectsController: Setting view "

    if-eq v0, v3, :cond_4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    const/4 v4, 0x4

    if-eq v0, v4, :cond_0

    goto/16 :goto_0

    .line 6
    :cond_0
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to INVISIBLE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :cond_1
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to GONE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const/16 v0, 0x8

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to VISIBLE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 15
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    .line 16
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SpecialEffectsController: Removing view "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " from container "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    :cond_7
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_8
    :goto_0
    return-void
.end method
