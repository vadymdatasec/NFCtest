.class public Le/c/a/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static synthetic d:[I


# instance fields
.field public b:F

.field public c:Le/c/a/x1;


# direct methods
.method public constructor <init>(F)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Le/c/a/b0;->b:F

    .line 8
    sget-object v0, Le/c/a/x1;->b:Le/c/a/x1;

    iput-object v0, p0, Le/c/a/b0;->c:Le/c/a/x1;

    .line 9
    iput p1, p0, Le/c/a/b0;->b:F

    .line 10
    iput-object v0, p0, Le/c/a/b0;->c:Le/c/a/x1;

    return-void
.end method

.method public constructor <init>(FLe/c/a/x1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le/c/a/b0;->b:F

    .line 3
    sget-object v0, Le/c/a/x1;->b:Le/c/a/x1;

    iput-object v0, p0, Le/c/a/b0;->c:Le/c/a/x1;

    .line 4
    iput p1, p0, Le/c/a/b0;->b:F

    .line 5
    iput-object p2, p0, Le/c/a/b0;->c:Le/c/a/x1;

    return-void
.end method

.method public static synthetic e()[I
    .locals 3

    .line 1
    sget-object v0, Le/c/a/b0;->d:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Le/c/a/x1;->values()[Le/c/a/x1;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Le/c/a/x1;->f:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Le/c/a/x1;->c:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Le/c/a/x1;->d:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Le/c/a/x1;->e:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Le/c/a/x1;->g:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v1, Le/c/a/x1;->i:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v1, Le/c/a/x1;->j:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v1, Le/c/a/x1;->h:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v1, Le/c/a/x1;->b:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    sput-object v0, Le/c/a/b0;->d:[I

    return-object v0
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 1
    iget v0, p0, Le/c/a/b0;->b:F

    return v0
.end method

.method public a(F)F
    .locals 2

    .line 14
    invoke-static {}, Le/c/a/b0;->e()[I

    move-result-object v0

    iget-object v1, p0, Le/c/a/b0;->c:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    .line 15
    iget p1, p0, Le/c/a/b0;->b:F

    return p1

    .line 16
    :pswitch_0
    iget v0, p0, Le/c/a/b0;->b:F

    mul-float v0, v0, p1

    const/high16 p1, 0x40c00000    # 6.0f

    div-float/2addr v0, p1

    return v0

    .line 17
    :pswitch_1
    iget v0, p0, Le/c/a/b0;->b:F

    mul-float v0, v0, p1

    const/high16 p1, 0x42900000    # 72.0f

    div-float/2addr v0, p1

    return v0

    .line 18
    :pswitch_2
    iget v0, p0, Le/c/a/b0;->b:F

    mul-float v0, v0, p1

    const p1, 0x41cb3333    # 25.4f

    div-float/2addr v0, p1

    return v0

    .line 19
    :pswitch_3
    iget v0, p0, Le/c/a/b0;->b:F

    mul-float v0, v0, p1

    const p1, 0x40228f5c    # 2.54f

    div-float/2addr v0, p1

    return v0

    .line 20
    :pswitch_4
    iget v0, p0, Le/c/a/b0;->b:F

    mul-float v0, v0, p1

    return v0

    .line 21
    :cond_0
    iget p1, p0, Le/c/a/b0;->b:F

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Le/c/a/l2;)F
    .locals 6

    .line 2
    iget-object v0, p0, Le/c/a/b0;->c:Le/c/a/x1;

    sget-object v1, Le/c/a/x1;->j:Le/c/a/x1;

    if-ne v0, v1, :cond_2

    .line 3
    invoke-virtual {p1}, Le/c/a/l2;->i()Le/c/a/n;

    move-result-object p1

    if-nez p1, :cond_0

    .line 4
    iget p1, p0, Le/c/a/b0;->b:F

    return p1

    .line 5
    :cond_0
    iget v0, p1, Le/c/a/n;->d:F

    .line 6
    iget p1, p1, Le/c/a/n;->e:F

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v2, v0, p1

    if-nez v2, :cond_1

    .line 7
    iget p1, p0, Le/c/a/b0;->b:F

    mul-float p1, p1, v0

    div-float/2addr p1, v1

    return p1

    :cond_1
    mul-float v0, v0, v0

    mul-float p1, p1, p1

    add-float/2addr v0, p1

    float-to-double v2, v0

    .line 8
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide v4, 0x3ff6a09e667f3bccL    # 1.414213562373095

    div-double/2addr v2, v4

    double-to-float p1, v2

    .line 9
    iget v0, p0, Le/c/a/b0;->b:F

    mul-float v0, v0, p1

    div-float/2addr v0, v1

    return v0

    .line 10
    :cond_2
    invoke-virtual {p0, p1}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result p1

    return p1
.end method

.method public a(Le/c/a/l2;F)F
    .locals 2

    .line 11
    iget-object v0, p0, Le/c/a/b0;->c:Le/c/a/x1;

    sget-object v1, Le/c/a/x1;->j:Le/c/a/x1;

    if-ne v0, v1, :cond_0

    .line 12
    iget p1, p0, Le/c/a/b0;->b:F

    mul-float p1, p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    return p1

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result p1

    return p1
.end method

.method public b(Le/c/a/l2;)F
    .locals 2

    .line 1
    invoke-static {}, Le/c/a/b0;->e()[I

    move-result-object v0

    iget-object v1, p0, Le/c/a/b0;->c:Le/c/a/x1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2
    iget p1, p0, Le/c/a/b0;->b:F

    return p1

    .line 3
    :pswitch_0
    invoke-virtual {p1}, Le/c/a/l2;->i()Le/c/a/n;

    move-result-object p1

    if-nez p1, :cond_0

    .line 4
    iget p1, p0, Le/c/a/b0;->b:F

    return p1

    .line 5
    :cond_0
    iget v0, p0, Le/c/a/b0;->b:F

    iget p1, p1, Le/c/a/n;->d:F

    mul-float v0, v0, p1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr v0, p1

    return v0

    .line 6
    :pswitch_1
    iget v0, p0, Le/c/a/b0;->b:F

    invoke-virtual {p1}, Le/c/a/l2;->j()F

    move-result p1

    mul-float v0, v0, p1

    const/high16 p1, 0x40c00000    # 6.0f

    div-float/2addr v0, p1

    return v0

    .line 7
    :pswitch_2
    iget v0, p0, Le/c/a/b0;->b:F

    invoke-virtual {p1}, Le/c/a/l2;->j()F

    move-result p1

    mul-float v0, v0, p1

    const/high16 p1, 0x42900000    # 72.0f

    div-float/2addr v0, p1

    return v0

    .line 8
    :pswitch_3
    iget v0, p0, Le/c/a/b0;->b:F

    invoke-virtual {p1}, Le/c/a/l2;->j()F

    move-result p1

    mul-float v0, v0, p1

    const p1, 0x41cb3333    # 25.4f

    div-float/2addr v0, p1

    return v0

    .line 9
    :pswitch_4
    iget v0, p0, Le/c/a/b0;->b:F

    invoke-virtual {p1}, Le/c/a/l2;->j()F

    move-result p1

    mul-float v0, v0, p1

    const p1, 0x40228f5c    # 2.54f

    div-float/2addr v0, p1

    return v0

    .line 10
    :pswitch_5
    iget v0, p0, Le/c/a/b0;->b:F

    invoke-virtual {p1}, Le/c/a/l2;->j()F

    move-result p1

    mul-float v0, v0, p1

    return v0

    .line 11
    :pswitch_6
    iget v0, p0, Le/c/a/b0;->b:F

    invoke-virtual {p1}, Le/c/a/l2;->h()F

    move-result p1

    mul-float v0, v0, p1

    return v0

    .line 12
    :pswitch_7
    iget v0, p0, Le/c/a/b0;->b:F

    invoke-virtual {p1}, Le/c/a/l2;->g()F

    move-result p1

    mul-float v0, v0, p1

    return v0

    .line 13
    :pswitch_8
    iget p1, p0, Le/c/a/b0;->b:F

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()Z
    .locals 2

    .line 14
    iget v0, p0, Le/c/a/b0;->b:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Le/c/a/l2;)F
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/b0;->c:Le/c/a/x1;

    sget-object v1, Le/c/a/x1;->j:Le/c/a/x1;

    if-ne v0, v1, :cond_1

    .line 2
    invoke-virtual {p1}, Le/c/a/l2;->i()Le/c/a/n;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3
    iget p1, p0, Le/c/a/b0;->b:F

    return p1

    .line 4
    :cond_0
    iget v0, p0, Le/c/a/b0;->b:F

    iget p1, p1, Le/c/a/n;->e:F

    mul-float v0, v0, p1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr v0, p1

    return v0

    .line 5
    :cond_1
    invoke-virtual {p0, p1}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 2

    .line 1
    iget v0, p0, Le/c/a/b0;->b:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Le/c/a/b0;->b:F

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le/c/a/b0;->c:Le/c/a/x1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
