.class public Lc/f/b/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:[I

.field public static c:Landroid/util/SparseIntArray;


# instance fields
.field public a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lc/f/b/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v1, v0, [I

    .line 1
    fill-array-data v1, :array_0

    sput-object v1, Lc/f/b/f;->b:[I

    .line 2
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    .line 3
    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintLeft_toLeftOf:I

    const/16 v3, 0x19

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 4
    sget-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintLeft_toRightOf:I

    const/16 v3, 0x1a

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 5
    sget-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintRight_toLeftOf:I

    const/16 v3, 0x1d

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 6
    sget-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintRight_toRightOf:I

    const/16 v3, 0x1e

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 7
    sget-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintTop_toTopOf:I

    const/16 v3, 0x24

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 8
    sget-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintTop_toBottomOf:I

    const/16 v3, 0x23

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 9
    sget-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintBottom_toTopOf:I

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 10
    sget-object v1, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v2, Lc/f/b/h;->ConstraintSet_layout_constraintBottom_toBottomOf:I

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 11
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintBaseline_toBaselineOf:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 12
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_editor_absoluteX:I

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 13
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_editor_absoluteY:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 14
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintGuide_begin:I

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 15
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintGuide_end:I

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 16
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintGuide_percent:I

    const/16 v2, 0x13

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 17
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_orientation:I

    const/16 v2, 0x1b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 18
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintStart_toEndOf:I

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 19
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintStart_toStartOf:I

    const/16 v2, 0x21

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 20
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintEnd_toStartOf:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 21
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintEnd_toEndOf:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 22
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_goneMarginLeft:I

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 23
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_goneMarginTop:I

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 24
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_goneMarginRight:I

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 25
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_goneMarginBottom:I

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 26
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_goneMarginStart:I

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 27
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_goneMarginEnd:I

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 28
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintVertical_weight:I

    const/16 v2, 0x28

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 29
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintHorizontal_weight:I

    const/16 v2, 0x27

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 30
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintHorizontal_chainStyle:I

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 31
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintVertical_chainStyle:I

    const/16 v2, 0x2a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 32
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintHorizontal_bias:I

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 33
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintVertical_bias:I

    const/16 v2, 0x25

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 34
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintDimensionRatio:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 35
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintLeft_creator:I

    const/16 v2, 0x4b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 36
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintTop_creator:I

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 37
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintRight_creator:I

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 38
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintBottom_creator:I

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 39
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintBaseline_creator:I

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 40
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_marginLeft:I

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 41
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_marginRight:I

    const/16 v2, 0x1c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 42
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_marginStart:I

    const/16 v2, 0x1f

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 43
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_marginEnd:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 44
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_marginTop:I

    const/16 v2, 0x22

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 45
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_marginBottom:I

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 46
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_width:I

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 47
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_layout_height:I

    const/16 v2, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 48
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_visibility:I

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 49
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_alpha:I

    const/16 v2, 0x2b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 50
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_elevation:I

    const/16 v2, 0x2c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 51
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_rotationX:I

    const/16 v2, 0x2d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 52
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_rotationY:I

    const/16 v2, 0x2e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 53
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_rotation:I

    const/16 v2, 0x3c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 54
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_scaleX:I

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 55
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_scaleY:I

    const/16 v2, 0x30

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 56
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_transformPivotX:I

    const/16 v2, 0x31

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 57
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_transformPivotY:I

    const/16 v2, 0x32

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 58
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_translationX:I

    const/16 v2, 0x33

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 59
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_translationY:I

    const/16 v2, 0x34

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 60
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_translationZ:I

    const/16 v2, 0x35

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 61
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintWidth_default:I

    const/16 v2, 0x36

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 62
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintHeight_default:I

    const/16 v2, 0x37

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 63
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintWidth_max:I

    const/16 v2, 0x38

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 64
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintHeight_max:I

    const/16 v2, 0x39

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 65
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintWidth_min:I

    const/16 v2, 0x3a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 66
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintHeight_min:I

    const/16 v2, 0x3b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 67
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintCircle:I

    const/16 v2, 0x3d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 68
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintCircleRadius:I

    const/16 v2, 0x3e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 69
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintCircleAngle:I

    const/16 v2, 0x3f

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 70
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_android_id:I

    const/16 v2, 0x26

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 71
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintWidth_percent:I

    const/16 v2, 0x45

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 72
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_layout_constraintHeight_percent:I

    const/16 v2, 0x46

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 73
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_chainUseRtl:I

    const/16 v2, 0x47

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 74
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_barrierDirection:I

    const/16 v2, 0x48

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 75
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_constraint_referenced_ids:I

    const/16 v2, 0x49

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 76
    sget-object v0, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    sget v1, Lc/f/b/h;->ConstraintSet_barrierAllowsGoneWidgets:I

    const/16 v2, 0x4a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x4
        0x8
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static a(Landroid/content/res/TypedArray;II)I
    .locals 1

    .line 60
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 61
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    :cond_0
    return p2
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/f/b/e;
    .locals 2

    .line 62
    new-instance v0, Lc/f/b/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc/f/b/e;-><init>(Lc/f/b/d;)V

    .line 63
    sget-object v1, Lc/f/b/h;->ConstraintSet:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 64
    invoke-virtual {p0, v0, p1}, Lc/f/b/f;->a(Lc/f/b/e;Landroid/content/res/TypedArray;)V

    .line 65
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string p1, "undefined"

    return-object p1

    :pswitch_0
    const-string p1, "end"

    return-object p1

    :pswitch_1
    const-string p1, "start"

    return-object p1

    :pswitch_2
    const-string p1, "baseline"

    return-object p1

    :pswitch_3
    const-string p1, "bottom"

    return-object p1

    :pswitch_4
    const-string p1, "top"

    return-object p1

    :pswitch_5
    const-string p1, "right"

    return-object p1

    :pswitch_6
    const-string p1, "left"

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(IIII)V
    .locals 9

    .line 3
    iget-object v0, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lc/f/b/e;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lc/f/b/e;-><init>(Lc/f/b/d;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    iget-object v0, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/f/b/e;

    const/4 v0, 0x2

    const/4 v1, 0x7

    const/4 v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x1

    const-string v6, "right to "

    const-string v7, " undefined"

    const/4 v8, -0x1

    packed-switch p2, :pswitch_data_0

    .line 6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    invoke-virtual {p0, p2}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " unknown"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    if-ne p4, v1, :cond_1

    .line 8
    iput p3, p1, Lc/f/b/e;->t:I

    .line 9
    iput v8, p1, Lc/f/b/e;->s:I

    goto/16 :goto_0

    :cond_1
    if-ne p4, v2, :cond_2

    .line 10
    iput p3, p1, Lc/f/b/e;->s:I

    .line 11
    iput v8, p1, Lc/f/b/e;->t:I

    goto/16 :goto_0

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    if-ne p4, v2, :cond_3

    .line 13
    iput p3, p1, Lc/f/b/e;->r:I

    .line 14
    iput v8, p1, Lc/f/b/e;->q:I

    goto/16 :goto_0

    :cond_3
    if-ne p4, v1, :cond_4

    .line 15
    iput p3, p1, Lc/f/b/e;->q:I

    .line 16
    iput v8, p1, Lc/f/b/e;->r:I

    goto/16 :goto_0

    .line 17
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    const/4 p2, 0x5

    if-ne p4, p2, :cond_5

    .line 18
    iput p3, p1, Lc/f/b/e;->p:I

    .line 19
    iput v8, p1, Lc/f/b/e;->o:I

    .line 20
    iput v8, p1, Lc/f/b/e;->n:I

    .line 21
    iput v8, p1, Lc/f/b/e;->l:I

    .line 22
    iput v8, p1, Lc/f/b/e;->m:I

    goto/16 :goto_0

    .line 23
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    if-ne p4, v3, :cond_6

    .line 24
    iput p3, p1, Lc/f/b/e;->o:I

    .line 25
    iput v8, p1, Lc/f/b/e;->n:I

    .line 26
    iput v8, p1, Lc/f/b/e;->p:I

    goto/16 :goto_0

    :cond_6
    if-ne p4, v4, :cond_7

    .line 27
    iput p3, p1, Lc/f/b/e;->n:I

    .line 28
    iput v8, p1, Lc/f/b/e;->o:I

    .line 29
    iput v8, p1, Lc/f/b/e;->p:I

    goto/16 :goto_0

    .line 30
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    if-ne p4, v4, :cond_8

    .line 31
    iput p3, p1, Lc/f/b/e;->l:I

    .line 32
    iput v8, p1, Lc/f/b/e;->m:I

    .line 33
    iput v8, p1, Lc/f/b/e;->p:I

    goto :goto_0

    :cond_8
    if-ne p4, v3, :cond_9

    .line 34
    iput p3, p1, Lc/f/b/e;->m:I

    .line 35
    iput v8, p1, Lc/f/b/e;->l:I

    .line 36
    iput v8, p1, Lc/f/b/e;->p:I

    goto :goto_0

    .line 37
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_5
    if-ne p4, v5, :cond_a

    .line 38
    iput p3, p1, Lc/f/b/e;->j:I

    .line 39
    iput v8, p1, Lc/f/b/e;->k:I

    goto :goto_0

    :cond_a
    if-ne p4, v0, :cond_b

    .line 40
    iput p3, p1, Lc/f/b/e;->k:I

    .line 41
    iput v8, p1, Lc/f/b/e;->j:I

    goto :goto_0

    .line 42
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    if-ne p4, v5, :cond_c

    .line 43
    iput p3, p1, Lc/f/b/e;->h:I

    .line 44
    iput v8, p1, Lc/f/b/e;->i:I

    goto :goto_0

    :cond_c
    if-ne p4, v0, :cond_d

    .line 45
    iput p3, p1, Lc/f/b/e;->i:I

    .line 46
    iput v8, p1, Lc/f/b/e;->h:I

    :goto_0
    return-void

    .line 47
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "left to "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Lc/f/b/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/content/Context;I)V
    .locals 4

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 49
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    .line 50
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_1

    .line 51
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lc/f/b/f;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/f/b/e;

    move-result-object v2

    const-string v3, "Guideline"

    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    iput-boolean v1, v2, Lc/f/b/e;->a:Z

    .line 55
    :cond_1
    iget-object v0, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    iget v1, v2, Lc/f/b/e;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 56
    :cond_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 57
    :goto_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 58
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    :catch_1
    move-exception p1

    .line 59
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method

.method public a(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/f/b/f;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->setConstraintSet(Lc/f/b/f;)V

    return-void
.end method

.method public final a(Lc/f/b/e;Landroid/content/res/TypedArray;)V
    .locals 7

    .line 66
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 67
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 68
    sget-object v3, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    const/high16 v4, 0x3f800000    # 1.0f

    const-string v5, "   "

    const-string v6, "ConstraintSet"

    packed-switch v3, :pswitch_data_2

    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown attribute 0x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 71
    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 72
    :pswitch_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unused attribute 0x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lc/f/b/f;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 74
    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 75
    :pswitch_1
    iget-boolean v3, p1, Lc/f/b/e;->r0:Z

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p1, Lc/f/b/e;->r0:Z

    goto/16 :goto_1

    .line 76
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lc/f/b/e;->v0:Ljava/lang/String;

    goto/16 :goto_1

    .line 77
    :pswitch_3
    iget v3, p1, Lc/f/b/e;->s0:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->s0:I

    goto/16 :goto_1

    :pswitch_4
    const-string v2, "CURRENTLY UNSUPPORTED"

    .line 78
    invoke-static {v6, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 79
    :pswitch_5
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->q0:F

    goto/16 :goto_1

    .line 80
    :pswitch_6
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->p0:F

    goto/16 :goto_1

    .line 81
    :pswitch_7
    iget v3, p1, Lc/f/b/e;->z:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->z:F

    goto/16 :goto_1

    .line 82
    :pswitch_8
    iget v3, p1, Lc/f/b/e;->y:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->y:I

    goto/16 :goto_1

    .line 83
    :pswitch_9
    iget v3, p1, Lc/f/b/e;->x:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->x:I

    goto/16 :goto_1

    .line 84
    :pswitch_a
    iget v3, p1, Lc/f/b/e;->X:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->X:F

    goto/16 :goto_1

    .line 85
    :pswitch_b
    iget v3, p1, Lc/f/b/e;->g0:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->g0:F

    goto/16 :goto_1

    .line 86
    :pswitch_c
    iget v3, p1, Lc/f/b/e;->f0:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->f0:F

    goto/16 :goto_1

    .line 87
    :pswitch_d
    iget v3, p1, Lc/f/b/e;->e0:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->e0:F

    goto/16 :goto_1

    .line 88
    :pswitch_e
    iget v3, p1, Lc/f/b/e;->d0:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->d0:F

    goto/16 :goto_1

    .line 89
    :pswitch_f
    iget v3, p1, Lc/f/b/e;->c0:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->c0:F

    goto/16 :goto_1

    .line 90
    :pswitch_10
    iget v3, p1, Lc/f/b/e;->b0:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->b0:F

    goto/16 :goto_1

    .line 91
    :pswitch_11
    iget v3, p1, Lc/f/b/e;->a0:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->a0:F

    goto/16 :goto_1

    .line 92
    :pswitch_12
    iget v3, p1, Lc/f/b/e;->Z:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->Z:F

    goto/16 :goto_1

    .line 93
    :pswitch_13
    iget v3, p1, Lc/f/b/e;->Y:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->Y:F

    goto/16 :goto_1

    :pswitch_14
    const/4 v3, 0x1

    .line 94
    iput-boolean v3, p1, Lc/f/b/e;->V:Z

    .line 95
    iget v3, p1, Lc/f/b/e;->W:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->W:F

    goto/16 :goto_1

    .line 96
    :pswitch_15
    iget v3, p1, Lc/f/b/e;->U:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->U:F

    goto/16 :goto_1

    .line 97
    :pswitch_16
    iget v3, p1, Lc/f/b/e;->T:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->T:I

    goto/16 :goto_1

    .line 98
    :pswitch_17
    iget v3, p1, Lc/f/b/e;->S:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->S:I

    goto/16 :goto_1

    .line 99
    :pswitch_18
    iget v3, p1, Lc/f/b/e;->Q:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->Q:F

    goto/16 :goto_1

    .line 100
    :pswitch_19
    iget v3, p1, Lc/f/b/e;->R:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->R:F

    goto/16 :goto_1

    .line 101
    :pswitch_1a
    iget v3, p1, Lc/f/b/e;->d:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->d:I

    goto/16 :goto_1

    .line 102
    :pswitch_1b
    iget v3, p1, Lc/f/b/e;->v:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->v:F

    goto/16 :goto_1

    .line 103
    :pswitch_1c
    iget v3, p1, Lc/f/b/e;->l:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->l:I

    goto/16 :goto_1

    .line 104
    :pswitch_1d
    iget v3, p1, Lc/f/b/e;->m:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->m:I

    goto/16 :goto_1

    .line 105
    :pswitch_1e
    iget v3, p1, Lc/f/b/e;->F:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->F:I

    goto/16 :goto_1

    .line 106
    :pswitch_1f
    iget v3, p1, Lc/f/b/e;->r:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->r:I

    goto/16 :goto_1

    .line 107
    :pswitch_20
    iget v3, p1, Lc/f/b/e;->q:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->q:I

    goto/16 :goto_1

    .line 108
    :pswitch_21
    iget v3, p1, Lc/f/b/e;->I:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->I:I

    goto/16 :goto_1

    .line 109
    :pswitch_22
    iget v3, p1, Lc/f/b/e;->k:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->k:I

    goto/16 :goto_1

    .line 110
    :pswitch_23
    iget v3, p1, Lc/f/b/e;->j:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->j:I

    goto/16 :goto_1

    .line 111
    :pswitch_24
    iget v3, p1, Lc/f/b/e;->E:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->E:I

    goto/16 :goto_1

    .line 112
    :pswitch_25
    iget v3, p1, Lc/f/b/e;->C:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->C:I

    goto/16 :goto_1

    .line 113
    :pswitch_26
    iget v3, p1, Lc/f/b/e;->i:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->i:I

    goto/16 :goto_1

    .line 114
    :pswitch_27
    iget v3, p1, Lc/f/b/e;->h:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->h:I

    goto/16 :goto_1

    .line 115
    :pswitch_28
    iget v3, p1, Lc/f/b/e;->D:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->D:I

    goto/16 :goto_1

    .line 116
    :pswitch_29
    iget v3, p1, Lc/f/b/e;->b:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->b:I

    goto/16 :goto_1

    .line 117
    :pswitch_2a
    iget v3, p1, Lc/f/b/e;->J:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->J:I

    .line 118
    sget-object v3, Lc/f/b/f;->b:[I

    aget v2, v3, v2

    iput v2, p1, Lc/f/b/e;->J:I

    goto/16 :goto_1

    .line 119
    :pswitch_2b
    iget v3, p1, Lc/f/b/e;->c:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->c:I

    goto/16 :goto_1

    .line 120
    :pswitch_2c
    iget v3, p1, Lc/f/b/e;->u:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->u:F

    goto/16 :goto_1

    .line 121
    :pswitch_2d
    iget v3, p1, Lc/f/b/e;->g:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p1, Lc/f/b/e;->g:F

    goto/16 :goto_1

    .line 122
    :pswitch_2e
    iget v3, p1, Lc/f/b/e;->f:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->f:I

    goto/16 :goto_1

    .line 123
    :pswitch_2f
    iget v3, p1, Lc/f/b/e;->e:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->e:I

    goto/16 :goto_1

    .line 124
    :pswitch_30
    iget v3, p1, Lc/f/b/e;->L:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->L:I

    goto/16 :goto_1

    .line 125
    :pswitch_31
    iget v3, p1, Lc/f/b/e;->P:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->P:I

    goto/16 :goto_1

    .line 126
    :pswitch_32
    iget v3, p1, Lc/f/b/e;->M:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->M:I

    goto/16 :goto_1

    .line 127
    :pswitch_33
    iget v3, p1, Lc/f/b/e;->K:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->K:I

    goto/16 :goto_1

    .line 128
    :pswitch_34
    iget v3, p1, Lc/f/b/e;->O:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->O:I

    goto :goto_1

    .line 129
    :pswitch_35
    iget v3, p1, Lc/f/b/e;->N:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->N:I

    goto :goto_1

    .line 130
    :pswitch_36
    iget v3, p1, Lc/f/b/e;->s:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->s:I

    goto :goto_1

    .line 131
    :pswitch_37
    iget v3, p1, Lc/f/b/e;->t:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->t:I

    goto :goto_1

    .line 132
    :pswitch_38
    iget v3, p1, Lc/f/b/e;->H:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->H:I

    goto :goto_1

    .line 133
    :pswitch_39
    iget v3, p1, Lc/f/b/e;->B:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->B:I

    goto :goto_1

    .line 134
    :pswitch_3a
    iget v3, p1, Lc/f/b/e;->A:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->A:I

    goto :goto_1

    .line 135
    :pswitch_3b
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lc/f/b/e;->w:Ljava/lang/String;

    goto :goto_1

    .line 136
    :pswitch_3c
    iget v3, p1, Lc/f/b/e;->n:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->n:I

    goto :goto_1

    .line 137
    :pswitch_3d
    iget v3, p1, Lc/f/b/e;->o:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->o:I

    goto :goto_1

    .line 138
    :pswitch_3e
    iget v3, p1, Lc/f/b/e;->G:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->G:I

    goto :goto_1

    .line 139
    :pswitch_3f
    iget v3, p1, Lc/f/b/e;->p:I

    invoke-static {p2, v2, v3}, Lc/f/b/f;->a(Landroid/content/res/TypedArray;II)I

    move-result v2

    iput v2, p1, Lc/f/b/e;->p:I

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x45
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Landroid/view/View;Ljava/lang/String;)[I
    .locals 9

    const-string v0, ","

    .line 140
    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 141
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 142
    array-length v1, p2

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 143
    :goto_0
    array-length v5, p2

    if-ge v3, v5, :cond_2

    .line 144
    aget-object v5, p2, v3

    .line 145
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 146
    :try_start_0
    const-class v6, Lc/f/b/g;

    .line 147
    invoke-virtual {v6, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    const/4 v7, 0x0

    .line 148
    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_0

    .line 149
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 150
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "id"

    .line 151
    invoke-virtual {v6, v5, v8, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    :cond_0
    if-nez v6, :cond_1

    .line 152
    invoke-virtual {p1}, Landroid/view/View;->isInEditMode()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    instance-of v7, v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v7, :cond_1

    .line 153
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 154
    invoke-virtual {v7, v2, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 155
    instance-of v7, v5, Ljava/lang/Integer;

    if-eqz v7, :cond_1

    .line 156
    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :cond_1
    add-int/lit8 v5, v4, 0x1

    .line 157
    aput v6, v1, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_0

    .line 158
    :cond_2
    array-length p1, p2

    if-eq v4, p1, :cond_3

    .line 159
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method public b(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 2
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ge v2, v0, :cond_8

    .line 3
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 4
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    if-eq v6, v3, :cond_7

    .line 5
    iget-object v7, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 6
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 7
    iget-object v7, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc/f/b/e;

    .line 8
    instance-of v8, v5, Lc/f/b/a;

    if-eqz v8, :cond_0

    .line 9
    iput v4, v7, Lc/f/b/e;->t0:I

    .line 10
    :cond_0
    iget v8, v7, Lc/f/b/e;->t0:I

    if-eq v8, v3, :cond_3

    if-eq v8, v4, :cond_1

    goto :goto_1

    .line 11
    :cond_1
    move-object v3, v5

    check-cast v3, Lc/f/b/a;

    .line 12
    invoke-virtual {v3, v6}, Landroid/view/View;->setId(I)V

    .line 13
    iget v4, v7, Lc/f/b/e;->s0:I

    invoke-virtual {v3, v4}, Lc/f/b/a;->setType(I)V

    .line 14
    iget-boolean v4, v7, Lc/f/b/e;->r0:Z

    invoke-virtual {v3, v4}, Lc/f/b/a;->setAllowsGoneWidget(Z)V

    .line 15
    iget-object v4, v7, Lc/f/b/e;->u0:[I

    if-eqz v4, :cond_2

    .line 16
    invoke-virtual {v3, v4}, Lc/f/b/b;->setReferencedIds([I)V

    goto :goto_1

    .line 17
    :cond_2
    iget-object v4, v7, Lc/f/b/e;->v0:Ljava/lang/String;

    if-eqz v4, :cond_3

    .line 18
    invoke-virtual {p0, v3, v4}, Lc/f/b/f;->a(Landroid/view/View;Ljava/lang/String;)[I

    move-result-object v4

    iput-object v4, v7, Lc/f/b/e;->u0:[I

    .line 19
    invoke-virtual {v3, v4}, Lc/f/b/b;->setReferencedIds([I)V

    .line 20
    :cond_3
    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 21
    invoke-virtual {v7, v3}, Lc/f/b/e;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 22
    invoke-virtual {v5, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    iget v3, v7, Lc/f/b/e;->J:I

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 24
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    if-lt v3, v4, :cond_6

    .line 25
    iget v3, v7, Lc/f/b/e;->U:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setAlpha(F)V

    .line 26
    iget v3, v7, Lc/f/b/e;->X:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setRotation(F)V

    .line 27
    iget v3, v7, Lc/f/b/e;->Y:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setRotationX(F)V

    .line 28
    iget v3, v7, Lc/f/b/e;->Z:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setRotationY(F)V

    .line 29
    iget v3, v7, Lc/f/b/e;->a0:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setScaleX(F)V

    .line 30
    iget v3, v7, Lc/f/b/e;->b0:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setScaleY(F)V

    .line 31
    iget v3, v7, Lc/f/b/e;->c0:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4

    .line 32
    iget v3, v7, Lc/f/b/e;->c0:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setPivotX(F)V

    .line 33
    :cond_4
    iget v3, v7, Lc/f/b/e;->d0:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_5

    .line 34
    iget v3, v7, Lc/f/b/e;->d0:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setPivotY(F)V

    .line 35
    :cond_5
    iget v3, v7, Lc/f/b/e;->e0:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setTranslationX(F)V

    .line 36
    iget v3, v7, Lc/f/b/e;->f0:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 37
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_6

    .line 38
    iget v3, v7, Lc/f/b/e;->g0:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setTranslationZ(F)V

    .line 39
    iget-boolean v3, v7, Lc/f/b/e;->V:Z

    if-eqz v3, :cond_6

    .line 40
    iget v3, v7, Lc/f/b/e;->W:F

    invoke-virtual {v5, v3}, Landroid/view/View;->setElevation(F)V

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 41
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 42
    :cond_8
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 43
    iget-object v2, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/f/b/e;

    .line 44
    iget v5, v2, Lc/f/b/e;->t0:I

    if-eq v5, v3, :cond_d

    if-eq v5, v4, :cond_a

    goto :goto_4

    .line 45
    :cond_a
    new-instance v5, Lc/f/b/a;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Lc/f/b/a;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/View;->setId(I)V

    .line 47
    iget-object v6, v2, Lc/f/b/e;->u0:[I

    if-eqz v6, :cond_b

    .line 48
    invoke-virtual {v5, v6}, Lc/f/b/b;->setReferencedIds([I)V

    goto :goto_3

    .line 49
    :cond_b
    iget-object v6, v2, Lc/f/b/e;->v0:Ljava/lang/String;

    if-eqz v6, :cond_c

    .line 50
    invoke-virtual {p0, v5, v6}, Lc/f/b/f;->a(Landroid/view/View;Ljava/lang/String;)[I

    move-result-object v6

    iput-object v6, v2, Lc/f/b/e;->u0:[I

    .line 51
    invoke-virtual {v5, v6}, Lc/f/b/b;->setReferencedIds([I)V

    .line 52
    :cond_c
    :goto_3
    iget v6, v2, Lc/f/b/e;->s0:I

    invoke-virtual {v5, v6}, Lc/f/b/a;->setType(I)V

    .line 53
    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateDefaultLayoutParams()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v6

    .line 54
    invoke-virtual {v5}, Lc/f/b/b;->a()V

    .line 55
    invoke-virtual {v2, v6}, Lc/f/b/e;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 56
    invoke-virtual {p1, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    :cond_d
    :goto_4
    iget-boolean v5, v2, Lc/f/b/e;->a:Z

    if-eqz v5, :cond_9

    .line 58
    new-instance v5, Landroidx/constraintlayout/widget/Guideline;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroidx/constraintlayout/widget/Guideline;-><init>(Landroid/content/Context;)V

    .line 59
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v5, v1}, Landroid/view/View;->setId(I)V

    .line 60
    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateDefaultLayoutParams()Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-result-object v1

    .line 61
    invoke-virtual {v2, v1}, Lc/f/b/e;->a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 62
    invoke-virtual {p1, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_e
    return-void
.end method

.method public c(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 2
    iget-object v1, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    .line 3
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    .line 5
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_5

    .line 6
    iget-object v5, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 7
    iget-object v5, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Lc/f/b/e;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lc/f/b/e;-><init>(Lc/f/b/d;)V

    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_0
    iget-object v5, p0, Lc/f/b/f;->a:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/f/b/e;

    .line 9
    invoke-static {v5, v4, v3}, Lc/f/b/e;->a(Lc/f/b/e;ILandroidx/constraintlayout/widget/ConstraintLayout$a;)V

    .line 10
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    iput v3, v5, Lc/f/b/e;->J:I

    .line 11
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    if-lt v3, v4, :cond_3

    .line 12
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->U:F

    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getRotation()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->X:F

    .line 14
    invoke-virtual {v2}, Landroid/view/View;->getRotationX()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->Y:F

    .line 15
    invoke-virtual {v2}, Landroid/view/View;->getRotationY()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->Z:F

    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getScaleX()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->a0:F

    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getScaleY()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->b0:F

    .line 18
    invoke-virtual {v2}, Landroid/view/View;->getPivotX()F

    move-result v3

    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getPivotY()F

    move-result v4

    float-to-double v6, v3

    const-wide/16 v8, 0x0

    cmpl-double v10, v6, v8

    if-nez v10, :cond_1

    float-to-double v6, v4

    cmpl-double v10, v6, v8

    if-eqz v10, :cond_2

    .line 20
    :cond_1
    iput v3, v5, Lc/f/b/e;->c0:F

    .line 21
    iput v4, v5, Lc/f/b/e;->d0:F

    .line 22
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->e0:F

    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->f0:F

    .line 24
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_3

    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getTranslationZ()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->g0:F

    .line 26
    iget-boolean v3, v5, Lc/f/b/e;->V:Z

    if-eqz v3, :cond_3

    .line 27
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    move-result v3

    iput v3, v5, Lc/f/b/e;->W:F

    .line 28
    :cond_3
    instance-of v3, v2, Lc/f/b/a;

    if-eqz v3, :cond_4

    .line 29
    check-cast v2, Lc/f/b/a;

    .line 30
    invoke-virtual {v2}, Lc/f/b/a;->b()Z

    move-result v3

    iput-boolean v3, v5, Lc/f/b/e;->r0:Z

    .line 31
    invoke-virtual {v2}, Lc/f/b/b;->getReferencedIds()[I

    move-result-object v3

    iput-object v3, v5, Lc/f/b/e;->u0:[I

    .line 32
    invoke-virtual {v2}, Lc/f/b/a;->getType()I

    move-result v2

    iput v2, v5, Lc/f/b/e;->s0:I

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 33
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-void
.end method
