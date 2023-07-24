.class public final enum Le/h/b/a/m/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/b/a/m/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Le/h/b/a/m/i;

.field public static final enum e:Le/h/b/a/m/i;

.field public static final enum f:Le/h/b/a/m/i;

.field public static final enum g:Le/h/b/a/m/i;

.field public static final synthetic h:[Le/h/b/a/m/i;


# instance fields
.field public final b:I

.field public c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/h/b/a/m/i;

    const v1, -0xde690d

    const/4 v2, 0x0

    const-string v3, "AVAILABLE"

    const v4, 0x7f070069

    invoke-direct {v0, v3, v2, v4, v1}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V

    sput-object v0, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    .line 2
    new-instance v0, Le/h/b/a/m/i;

    const/4 v3, 0x1

    const-string v4, "ERROR"

    const v5, 0x7f07006b

    const v6, -0xbbcca

    invoke-direct {v0, v4, v3, v5, v6}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V

    sput-object v0, Le/h/b/a/m/i;->e:Le/h/b/a/m/i;

    .line 3
    new-instance v0, Le/h/b/a/m/i;

    const/4 v4, 0x2

    const-string v5, "OK"

    const v6, 0x7f07006c

    const v7, -0xb350b0

    invoke-direct {v0, v5, v4, v6, v7}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V

    sput-object v0, Le/h/b/a/m/i;->f:Le/h/b/a/m/i;

    .line 4
    new-instance v0, Le/h/b/a/m/i;

    const/4 v5, 0x3

    const-string v6, "BADGING"

    const v7, 0x7f07006a

    invoke-direct {v0, v6, v5, v7, v1}, Le/h/b/a/m/i;-><init>(Ljava/lang/String;III)V

    sput-object v0, Le/h/b/a/m/i;->g:Le/h/b/a/m/i;

    const/4 v1, 0x4

    new-array v1, v1, [Le/h/b/a/m/i;

    .line 5
    sget-object v6, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    aput-object v6, v1, v2

    sget-object v2, Le/h/b/a/m/i;->e:Le/h/b/a/m/i;

    aput-object v2, v1, v3

    sget-object v2, Le/h/b/a/m/i;->f:Le/h/b/a/m/i;

    aput-object v2, v1, v4

    aput-object v0, v1, v5

    sput-object v1, Le/h/b/a/m/i;->h:[Le/h/b/a/m/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p4, p0, Le/h/b/a/m/i;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/b/a/m/i;
    .locals 1

    .line 1
    const-class v0, Le/h/b/a/m/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/b/a/m/i;

    return-object p0
.end method

.method public static values()[Le/h/b/a/m/i;
    .locals 1

    .line 1
    sget-object v0, Le/h/b/a/m/i;->h:[Le/h/b/a/m/i;

    invoke-virtual {v0}, [Le/h/b/a/m/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/b/a/m/i;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Le/h/b/a/m/i;
    .locals 0

    .line 2
    iput-object p1, p0, Le/h/b/a/m/i;->c:Ljava/lang/String;

    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/m/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public a(Le/h/b/a/m/e;Le/h/b/a/m/d;)V
    .locals 4

    .line 3
    invoke-virtual {p1}, Le/h/b/a/m/e;->R()Landroid/widget/ProgressBar;

    move-result-object v0

    .line 4
    sget-object v1, Le/h/b/a/m/h;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 p1, 0x3

    if-eq v1, p1, :cond_0

    .line 5
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "badge "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Le/h/b/a/m/d;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "TransactionState "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " message "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/b/a/m/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TRANSACTIONSTATE"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-virtual {p2}, Le/h/b/a/m/d;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 10
    invoke-virtual {p2, v0}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V

    .line 11
    new-instance v0, Le/h/b/a/l/v0;

    invoke-virtual {p1}, Le/h/b/a/m/e;->J()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-direct {v0, p1}, Le/h/b/a/l/v0;-><init>(Landroid/view/ViewGroup;)V

    iget-object p1, p0, Le/h/b/a/m/i;->c:Ljava/lang/String;

    iget v1, p0, Le/h/b/a/m/i;->b:I

    invoke-virtual {v0, p1, v1, p2}, Le/h/b/a/l/v0;->a(Ljava/lang/String;ILe/h/b/a/m/d;)V

    :cond_2
    :goto_0
    return-void
.end method
