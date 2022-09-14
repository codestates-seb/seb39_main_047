import * as S from './style';

type Props = {
  children: React.ReactNode;
  // onClick: ()=> void
};

const Button: React.FC<Props> = ({ children }) => {
  return <S.ButtonComponent>{children}</S.ButtonComponent>;
};

export default Button;
